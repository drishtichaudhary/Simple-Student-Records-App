# Simple Student Records App

A basic Java desktop application for efficiently storing and managing student details including name, age, subjects, and marks. The app uses a PostgreSQL database for persistence, allows easy record management, and provides a clean, user-friendly interface for quick data entry and updates.

## Features

- **Add & Update Records:** Easily create, view, update, and manage student information.
- **Database Integrated:** Uses PostgreSQL for reliable data storage and retrieval.
- **Clean UI:** Minimal, intuitive interface for fast navigation and efficient data entry.
- **Java Desktop App:** Built in Java, leveraging modern desktop application patterns.

## Getting Started

### Prerequisites

- Java JDK (8 or later)
- Maven (for building the project)
- PostgreSQL database

### Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/drishtichaudhary/Simple-Student-Records-App.git
   cd Simple-Student-Records-App
   ```

2. **Configure Database:**
   - Create a PostgreSQL database (e.g., `student_records`).
   - Update the database connection details in your code (usually in a config or properties file inside `src/`).
   - Run SQL migration scripts if included, or create required tables using schema definitions.

3. **Build the Project:**
   ```bash
   mvn clean install
   ```

4. **Run the Application:**
   - Using your IDE: Import the project and run the main class.
   - From command line:
     ```bash
     mvn exec:java
     ```

## Project Structure

- `src/`             - Application source code
- `pom.xml`          - Maven build configuration
- `.gitignore`       - Git ignores
- `nbactions.xml`    - NetBeans build actions

## Usage

- Open the application.
- Add new student records via the form.
- View, update, and search student details as required.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss your ideas.

## License

This project is published for educational and demo purposes. Add a license if you intend to specify allowed uses.

---

**Repository:** [drishtichaudhary/Simple-Student-Records-App](https://github.com/drishtichaudhary/Simple-Student-Records-App)
