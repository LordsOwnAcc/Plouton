# 🚨 CivicTrack - Android App

Empowering citizens to report and track civic issues like road damage, water leaks, garbage overflow, and more — right from their neighborhood. Built with ❤️ using **Jetpack Compose** and **Retrofit**.

---

## 📱 Features

✅ **Report Local Issues**  
Citizens can report issues with title, description, photos, category, and location.

✅ **GPS-Based Visibility**  
Users only see reports within a 3–5 km radius for hyperlocal relevance.

✅ **Categories Supported**
- Roads (potholes, obstructions)
- Lighting (broken or flickering)
- Water Supply (leaks, low pressure)
- Cleanliness (overflowing bins, garbage)
- Public Safety (open manholes, exposed wires)
- Obstructions (fallen trees, debris)

✅ **Real-Time Status Tracking**  
Users get notified when issue status changes (e.g., In Progress, Resolved).

✅ **Map View & Filters**  
Issues shown as pins on a map with filters for:
- Status (Reported, In Progress, Resolved)
- Category
- Distance (1km, 3km, 5km)

✅ **Spam Control & Moderation**  
Users can flag irrelevant/spam reports. Admin reviews flagged entries.

✅ **Anonymous or Verified Reports**  
Users can report without registration or login as verified users.

---

## 🔧 Tech Stack

### 📦 Frontend
- **Kotlin**
- **Jetpack Compose**
- **Retrofit** for network calls
- **Coil** or **Glide** for image loading
- **Google Maps SDK** (for map mode)
- **Hilt/Dagger** for dependency injection

### ☁️ Backend (Expected API Integration)
- Node.js 
- MongoDB 
- REST API 

   git clone https://github.com/yourusername/civictrack-android.git
   cd civictrack-android
