import mongoose from "mongoose";

const issueSchema = new mongoose.Schema({
  title: String,
  description: String,
  category: String,
  latitude: Number,
  longitude: Number,
  images: [String],
  status: { type: String, default: "Reported" },
  statusLogs: [{ status: String, timestamp: Date }],
  user: { type: mongoose.Schema.Types.ObjectId, ref: "User" }
}, { timestamps: true });

export default mongoose.model("Issue", issueSchema);