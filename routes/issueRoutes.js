import express from "express";
import { protect } from "../middleware/authMiddleware.js";
import { upload } from "../utils/upload.js";
import {
  createIssue,
  getNearbyIssues,
  getIssueById,
  updateIssueStatus,
  flagIssue
} from "../controllers/issueController.js";

const router = express.Router();

router.post("/", upload.array("images", 3), createIssue);
router.get("/nearby", getNearbyIssues);
router.get("/:id", getIssueById);
router.patch("/:id/status", protect, updateIssueStatus);
router.post("/:id/flag", protect, flagIssue);

export default router;