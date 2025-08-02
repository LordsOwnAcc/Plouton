# 🏙️ CivicTrack — Full-Stack Civic Issue Tracker

![Hackathon Project](https://img.shields.io/badge/Project-Hackathon-blueviolet?style=for-the-badge)
![API Status](https://img.shields.io/website?label=API%20Status&style=for-the-badge&up_message=Online&url=https%3A%2F%2Fcivictrack-backend-xtr2.onrender.com%2Fapi%2Fposts)
![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android)
![Backend](https://img.shields.io/badge/Backend-Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white)

---

## 📖 Overview

**CivicTrack** empowers citizens to report and track civic issues like road damage, water leaks, and garbage overflow — all within their local neighborhood.  
The project features a **native Android app** built with Jetpack Compose and a **custom REST API** developed by a **team member during a hackathon**.

The backend API was **designed and implemented from scratch** for this app and is **fully functional** — handling all **data, logic, and authentication** for the platform.

🔗 **Project Repository (Full Stack):** [CivicTrack — GitHub](https://github.com/its-AmitB/oddo-project/tree/main)

---

## 🚀  🔴 Live Working Backend API 🔴

- **Base URL:** [https://civictrack-backend-xtr2.onrender.com](https://civictrack-backend-xtr2.onrender.com)  
- **Test Endpoint:** [View All Posts](https://civictrack-backend-xtr2.onrender.com/api/posts)

---

## ✨ Key Features

✅ **Report Local Issues** — Submit reports with title, description, photos, category, and location  
✅ **GPS-Based Filtering** — View only issues within a 3–5 km radius  
✅ **Multiple Categories** — Roads, Lighting, Water Supply, Public Safety, and more  
✅ **Real-Time Status Tracking** — Get notified on status updates (In Progress, Resolved)  
✅ **Map Integration** — View issues as pins on Google Maps with filtering  
✅ **Moderation Tools** — Flag and review spam or irrelevant posts  

---

## 📸 App Screenshots

<img src="https://github.com/user-attachments/assets/e8a080ef-36d6-481a-ae9f-b513478394eb" width="150" alt="Screenshot 1">
<img src="https://github.com/user-attachments/assets/2ecbe9f5-7744-4af5-83e8-c585ee081a19" width="150" alt="Screenshot 2">
<img src="https://github.com/user-attachments/assets/50881ea4-8439-40a7-a693-c39df9ccb8d3" width="150" alt="Screenshot 3">

---

## 🛠 Tech Stack & Architecture

### 📱 Frontend (Android App)
- **Language:** Kotlin  
- **UI:** Jetpack Compose  
- **Networking:** Retrofit  
- **Maps:** Google Maps SDK  

### ☁️ Backend (Custom REST API)
- **Runtime:** Node.js  
- **Framework:** Express.js  
- **Database:** MongoDB with Mongoose  
- **Authentication:** JSON Web Tokens (JWT)  
- **Deployment:** Render.com  

---

## 🔌 Backend API — Main Endpoints

| Method  | Endpoint                  | Description                         | Auth |
|---------|---------------------------|--------------------------------------|------|
| POST    | `/api/register`           | Register a new user                  | No   |
| POST    | `/api/login`              | Login and receive JWT                | No   |
| GET     | `/api/profile`            | Get logged-in user's profile         | Yes  |
| GET     | `/api/posts`              | List all civic issue posts           | No   |
| GET     | `/api/posts/:id`          | Get a specific post by ID            | No   |
| POST    | `/api/posts`              | Create a new post                    | Yes  |
| DELETE  | `/api/posts/:id`          | Delete a user's post                 | Yes  |
| PUT     | `/api/posts/like/:id`     | Like a post                          | Yes  |
| POST    | `/api/posts/comment/:id`  | Comment on a post                    | Yes  |

---

## 🏗 Architecture & Technical Design

### **1. Modularity**
- 📂 **Clean Folder Structure**: `routes`, `controllers`, `models`, `middleware`.
- 🔄 **Reusable Components**: Common validation, error handling, and authentication modules.
- 🔍 **Low Coupling, High Cohesion**: Business logic isolated from routing and database operations.

### **2. Database Design**
- 🗄 **MongoDB + Mongoose**: Strong schema definitions with validation rules.
- 🔗 **Relationships**: Posts reference their authors (`User` model).
- ⚡ **Performance**: Indexed key fields for faster queries at scale.

### **3. Scalability**
- 🌐 **Stateless API**: JWT auth supports horizontal scaling.
- ⚙ **Non-blocking I/O**: Async Node.js architecture handles high concurrency.
- 📈 **Extensibility**: Easily add new features without breaking existing code.

---
## 💻 Code Quality

- ✅ **Consistent Naming & Formatting** — Industry-standard JavaScript conventions.
- 📖 **Readable Control Flow** — `async/await` with structured `try/catch`.
- 📝 **JSDoc Documentation** — For functions, models, and middleware.
- 🛠 **Edge Case Handling** — Input validation and descriptive error responses.

---

## 🛡 Security

- 🔐 **JWT Authentication & Role-based Authorization**
- 🛡 **Password Hashing** — `bcryptjs` for secure storage.
- 🚫 **Injection Prevention** — Input sanitization to block attacks.
- 🌍 **HTTPS-Ready** — Secure headers and TLS support.

---

## ⚙️ Local Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/its-AmitB/oddo-project.git
