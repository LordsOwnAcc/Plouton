# 🏙️ CivicTrack — Full-Stack Civic Issue Tracker

![Hackathon Project](https://img.shields.io/badge/Project-Hackathon-blueviolet?style=for-the-badge)
![API Status](https://img.shields.io/website?label=API%20Status&style=for-the-badge&up_message=Online&url=https%3A%2F%2Fcivictrack-backend-xtr2.onrender.com%2Fapi%2Fposts)
![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android)
![Backend](https://img.shields.io/badge/Backend-Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white)

---

## 📖 Overview

**CivicTrack** empowers citizens to **report** and **track** civic issues like road damage, water leaks, and garbage overflow — right from their neighborhood.

This **full-stack project** consists of:
- 📱 **Native Android App** (Frontend)
- ☁️ **Custom REST API** (Backend)

Developed during a **hackathon**, it delivers a **real-world solution** for community issue reporting and tracking.

---

## 🚀 Live Demo

- **Base API URL:** [https://civictrack-backend-xtr2.onrender.com](https://civictrack-backend-xtr2.onrender.com)
- **Test Endpoint:** [View Posts](https://civictrack-backend-xtr2.onrender.com/api/posts)

---

## ✨ Features

- ✅ **Report Local Issues** — title, description, photos, category, and location.
- ✅ **GPS-Based Visibility** — see issues only within a 3–5 km radius.
- ✅ **Multiple Categories** — Roads, Lighting, Water Supply, Public Safety, etc.
- ✅ **Real-Time Status Tracking** — In Progress, Resolved updates.
- ✅ **Map View & Filters** — view issues as pins with filters.
- ✅ **Spam Control** — flag irrelevant reports for moderation.

---

## 📸 App Screenshots

<img src="https://github.com/user-attachments/assets/e8a080ef-36d6-481a-ae9f-b513478394eb" width="150" alt="Screenshot 1">
<img src="https://github.com/user-attachments/assets/2ecbe9f5-7744-4af5-83e8-c585ee081a19" width="150" alt="Screenshot 2">
<img src="https://github.com/user-attachments/assets/50881ea4-8439-40a7-a693-c39df9ccb8d3" width="150" alt="Screenshot 3">

---

## 🛠 Tech Stack

### 📱 Frontend (Android App)
- **Language:** Kotlin  
- **UI:** Jetpack Compose  
- **Networking:** Retrofit  
- **Maps:** Google Maps SDK  
- **Dependency Injection:** Hilt/Dagger  

### ☁️ Backend (REST API)
- **Runtime:** Node.js  
- **Framework:** Express.js  
- **Database:** MongoDB + Mongoose  
- **Authentication:** JWT (JSON Web Token)  
- **File Uploads:** Multer  
- **Deployment:** Render.com  

---

## 🔌 API Documentation

| Method  | Endpoint                  | Description                         | Auth |
|---------|---------------------------|--------------------------------------|------|
| POST    | `/api/register`           | Register a new user                  | No   |
| POST    | `/api/login`              | Login and receive JWT                | No   |
| GET     | `/api/profile`            | Get logged-in user's profile         | Yes  |
| GET     | `/api/posts`              | List all civic issue posts           | No   |
| GET     | `/api/posts/:id`          | Get single post by ID                | No   |
| POST    | `/api/posts`              | Create a new post                    | Yes  |
| DELETE  | `/api/posts/:id`          | Delete post owned by user            | Yes  |
| PUT     | `/api/posts/like/:id`     | Like a post                          | Yes  |
| POST    | `/api/posts/comment/:id`  | Add comment to a post                | Yes  |

---

## ⚙️ Local Setup

### 1️⃣ Clone Repository
```bash
git clone https://github.com/its-AmitB/oddo-project.git
