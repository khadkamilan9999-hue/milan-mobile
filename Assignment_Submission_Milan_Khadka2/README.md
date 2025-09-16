# NIT3213 Final Assignment – Android Application

## 👤 Student Info
- **Name:** Milan Khadka  
- **Student ID:** s8112852  

---

## 📌 Project Overview
This project is an Android application demonstrating **clean mobile development practices**.  
The app is built with **Kotlin** using **MVVM architecture**, **Hilt dependency injection**, and **Retrofit networking**.  
It includes three key screens:
1. **Login** – simple authentication flow.  
2. **Dashboard** – data displayed in a **RecyclerView**.  
3. **Details** – item details with **Navigation Component** + SafeArgs.  

---

## 🏗️ Architecture
The app follows **MVVM + Repository** pattern with:  
- UI Layer (Fragments)  
- ViewModel Layer (StateFlow + Coroutines)  
- Repository Layer (Retrofit API calls)  
- Dependency Injection (Hilt)  
- Navigation Component  

---

## 📚 Libraries & Tools
- Kotlin, Android Jetpack, Hilt (Dagger), Retrofit, OkHttp, Gson  
- RecyclerView + DiffUtil  
- Coroutines & Flow  
- JUnit + MockK for testing  

---

## 📱 App Features
- Login screen with validation  
- Dashboard fetching data from API into RecyclerView  
- Details screen navigation with SafeArgs  
- Error handling and UI/UX design principles applied  

---

## 🧪 Testing
Unit test in `DashboardViewModelTest.kt` using JUnit + MockK.  
Ensures correct item count and StateFlow emissions.  

---

## 🗂️ Project Structure
```
app/
 └── src/main/java/com/example/app/
      ├── di/             # Hilt modules
      ├── data/remote/    # Retrofit API
      ├── repository/     # Repository layer
      ├── ui/             # Fragments (Login, Dashboard, Details)
      ├── viewmodel/      # ViewModels
      └── model/          # Data models
```

---

## ✅ Rubric Mapping
- **Architecture (30%)** → MVVM + Hilt + Repository  
- **UI/UX (20%)** → RecyclerView, Navigation, clean layouts  
- **Networking (20%)** → Retrofit + Coroutines  
- **Testing (10%)** → JUnit + MockK  
- **Clean Code (10%)** → Separation of concerns  
- **Git Usage (10%)** → Multiple meaningful commits  

---
