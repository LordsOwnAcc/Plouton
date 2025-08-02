import Flag from "../models/Flag.js";
import Issue from "../models/Issue.js";
import User from "../models/User.js";

export const getFlaggedIssues = async (req, res) => {
  const flagged = await Flag.find().populate("issue");
  res.json(flagged);
};

export const deleteIssue = async (req, res) => {
  await Issue.findByIdAndDelete(req.params.id);
  res.json({ message: "Issue deleted" });
};

export const banUser = async (req, res) => {
  const { userId } = req.body;
  await User.findByIdAndUpdate(userId, { role: "banned" });
  res.json({ message: "User banned" });
};

export const getAnalytics = async (req, res) => {
  const totalIssues = await Issue.countDocuments();
  const categoryCounts = await Issue.aggregate([
    { $group: { _id: "$category", count: { $sum: 1 } } }
  ]);
  const activeZones = await Issue.aggregate([
    { $group: { _id: { lat: "$latitude", lng: "$longitude" }, count: { $sum: 1 } } }
  ]);
  res.json({
    totalIssues,
    topCategories: categoryCounts,
    activeZones
  });
};
