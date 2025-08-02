import express from "express";
import { protect } from "../middleware/authMiddleware.js";
import { adminOnly } from "../middleware/adminMiddleware.js";
import { getFlaggedIssues, deleteIssue, banUser, getAnalytics } from "../controllers/adminController.js";

const router = express.Router();

router.get("/issues/flagged", protect, adminOnly, getFlaggedIssues);
router.delete("/issues/:id", protect, adminOnly, deleteIssue);
router.post("/ban-user", protect, adminOnly, banUser);
router.get("/analytics", protect, adminOnly, getAnalytics);

export default router;