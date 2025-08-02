import mongoose from "mongoose";

const flagSchema = new mongoose.Schema({
  issue: { type: mongoose.Schema.Types.ObjectId, ref: "Issue" },
  reason: String,
  flaggedBy: { type: mongoose.Schema.Types.ObjectId, ref: "User" }
}, { timestamps: true });

export default mongoose.model("Flag", flagSchema);