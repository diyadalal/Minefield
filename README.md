# Minefield

Minefield is a Java-based implementation of the classic **Minesweeper** game, developed with an emphasis on **object-oriented design**, **clean architecture**, and **interactive GUI development**. The project follows the **Model–View–Controller (MVC)** pattern to clearly separate game logic, user interface, and control flow.

---

## Features

- Fully playable Minesweeper-style game with an interactive graphical interface
- Randomized mine placement and dynamic board generation
- Recursive cell-reveal logic for uncovering contiguous empty regions
- Real-time UI updates using Java Swing

---

## Architecture

The application follows the **Model–View–Controller (MVC)** architecture:

- **Model**
  - Manages game state, mine placement, adjacency calculations, and win/loss conditions
- **View**
  - Renders the graphical interface and responds to model updates
- **Controller**
  - Handles user interactions and translates UI actions into model updates

---

## Tech Stack

- **Language:** Java  
- **UI Framework:** Java Swing  
- **Design Patterns:** MVC, Command, Factory  
- **Testing:** JUnit  

---

## How to Run

1. Clone the repository:

    ```
    git clone https://github.com/diyadalal/Minefield.git
    cd Minefield
    ```

Alternatively, you may download the project as a ZIP file and extract it locally.


### Step 2: Open the Project

Open the project in a Java IDE such as **IntelliJ IDEA** or **Eclipse**.


### Step 3: Run the Application

Open and Run:
- File path: `src/minefield/MinefieldPanel.java`
---
