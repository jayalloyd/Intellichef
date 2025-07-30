# Intellichef
IntelliChef 🍽️✨
AI-Powered Recipe Assistant & Culinary Companion

Table of Contents
About IntelliChef

Features

Technologies Used

Getting Started

Prerequisites

Backend Setup (Spring Boot)

Frontend Setup (React)

Configuration

Database Schema

API Endpoints

Future Enhancements

Contributing

License

Contact

About IntelliChef
IntelliChef is a modern, full-stack web application designed to revolutionize your cooking experience. Building upon a traditional recipe management system, IntelliChef leverages the power of Artificial Intelligence (via Spring AI) to offer intelligent features that inspire creativity, streamline meal preparation, and help you make the most of your ingredients.

Key Motivations:

To create a robust full-stack application using Spring Boot and React.

To explore and implement practical AI applications using Spring AI.

To provide users with a "smart" kitchen assistant that goes beyond simple recipe storage.

To demonstrate the seamless integration of AI capabilities into a modern web application.

Features
Core Recipe Management:

User Authentication & Authorization: Secure user registration and login with Spring Security.

Create, Read, Update, Delete (CRUD) Recipes: Add, view, edit, and remove your favorite recipes.

Detailed Recipe View: Comprehensive pages for each recipe, including ingredients, step-by-step instructions, and images.

Categorization & Search: Organize recipes by custom categories and search by title, ingredients, or keywords.

Personalized Recipe Collection: Users can manage their own private collection of recipes.

AI-Powered Smart Features (Powered by Spring AI):

Intelligent Recipe Generation:

Generate new recipe ideas based on ingredients you have on hand.

Request recipes tailored to specific dietary restrictions (e.g., "gluten-free," "vegetarian").

Get inspiration for different meal types or cuisines.

Smart Ingredient Substitution: Ask IntelliChef for suitable substitutes if you're missing an ingredient, along with suggested quantities.

Recipe Scaling Assistant: Easily scale a recipe up or down for a different number of servings, with adjusted ingredient quantities.

Content Refinement: Improve the clarity or conciseness of your recipe instructions with AI assistance.

Automated Difficulty Assessment: AI can analyze recipe complexity and suggest a difficulty level (e.g., Easy, Medium, Hard).

Coming Soon (Potential): Semantic Recipe Search, Nutritional Information Estimation, Meal Planning.

Technologies Used
This project is built using a modern full-stack approach:

Backend:

Spring Boot: Framework for building robust, scalable RESTful APIs.

Spring Data JPA: For seamless database interaction and ORM.

PostgreSQL: Relational database for persistent storage of recipe data.

Spring Security (JWT/OAuth2): For user authentication and authorization.

Spring AI: High-level abstraction for integrating various AI models (e.g., OpenAI GPT, Google Gemini, etc.).

Lombok: Reduces boilerplate code (optional, but recommended for cleaner entities/DTOs).

Maven: Dependency management and build automation.

Frontend:

React: JavaScript library for building dynamic and interactive user interfaces.

Axios / Fetch API: For making HTTP requests to the Spring Boot backend.

React Router: For client-side routing.

React Hook Form / Formik (Optional): For efficient form management and validation.

Charting Library (e.g., Chart.js, Recharts) (Optional, for future analytics): For data visualization.

HTML5 / CSS3: For structuring and styling the web application.

JavaScript (ES6+)

NPM / Yarn: Package manager.

Getting Started
Follow these steps to get IntelliChef up and running on your local machine.

Prerequisites
Java Development Kit (JDK) 17 or higher: Download JDK

Maven 3.6+: Download Maven

Node.js 18+ and npm 9+ (or Yarn): Download Node.js

PostgreSQL Database: Download PostgreSQL

An API Key for an LLM Provider:

OpenAI: OpenAI Platform (e.g., for GPT-3.5, GPT-4)

Google AI Studio: Google AI Studio (for Google Gemini)

Azure OpenAI / Hugging Face: (If you prefer other providers, configure Spring AI accordingly)

Backend Setup (Spring Boot)
Clone the Repository:

Bash

git clone https://github.com/jayalloyd/IntelliChef.git
cd IntelliChef/backend # Navigate to your Spring Boot project folder
(Note: Adjust backend to your actual backend folder name if different)

Database Setup:

Create a PostgreSQL database (e.g., intellichef_db).

Ensure your src/main/resources/application.properties (or application.yml) is configured correctly for your PostgreSQL instance:

Properties

spring.datasource.url=jdbc:postgresql://localhost:5432/intellichef_db
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
If you have an existing MySQL schema, you'll need to migrate it to PostgreSQL. Spring Data JPA with ddl-auto=update can help with creating tables if your entities are mapped correctly and the tables don't exist, but for existing data, consider using a migration tool or manually creating the schema.

Configure Spring AI API Key:

Set your AI API key as an environment variable (recommended) or directly in application.properties:

Properties

# Example for OpenAI
spring.ai.openai.api-key=${OPENAI_API_KEY}
# Or for Google Gemini
# spring.ai.google.gemini.api-key=${GEMINI_API_KEY}
It's best practice to use environment variables for secrets. You can set it in your shell:

Bash

export OPENAI_API_KEY="your_actual_openai_api_key_here"
(Or add to your .bashrc/.zshrc for persistence).

Build and Run the Backend:

Bash

mvn clean install
mvn spring-boot:run
The backend will typically run on http://localhost:8080.

Frontend Setup (React)
Navigate to the Frontend Directory:

Bash

cd ../frontend # Assuming 'frontend' is in the parent directory of 'backend'
(Note: Adjust frontend to your actual frontend folder name if different)

Install Dependencies:

Bash

npm install
# or yarn install
Configure API Endpoint:

Ensure your React app is configured to communicate with your Spring Boot backend (typically http://localhost:8080). This is usually done via a proxy in package.json or by setting an environment variable (.env.development, .env.production).

JSON

// frontend/package.json
"proxy": "http://localhost:8080",
Or explicitly define the base URL in your API service:

JavaScript

// frontend/src/services/api.js
const API_BASE_URL = process.env.REACT_APP_API_BASE_URL || 'http://localhost:8080/api';
Run the Frontend:

Bash

npm start
# or yarn start
The React development server will start (usually on http://localhost:3000) and automatically open in your browser.

Configuration
Relevant configuration files:

backend/src/main/resources/application.properties (or .yml): Database, AI API keys, server port.

frontend/.env.development (if used): Frontend environment variables like backend API URL.

Database Schema
IntelliChef utilizes a relational database (PostgreSQL) to store recipe and user information. The core entities include:

User: Manages user authentication and profiles.

Recipe: Stores details about each recipe (title, instructions, image URL, category, etc.).

Ingredient: Represents individual ingredients, potentially linked to recipes (via a join table or embedded).

InstructionStep: Represents individual steps in a recipe's instructions.

(You might want to add a more detailed schema diagram or list key fields for each table here.)

API Endpoints
The Spring Boot backend exposes RESTful APIs for managing recipes and interacting with AI services.

User & Authentication:

POST /api/auth/register: Register a new user.

POST /api/auth/login: Authenticate a user and receive a JWT.

GET /api/users/me: Get current user details.

Recipe Management:

GET /api/recipes: Retrieve all recipes (or filtered).

GET /api/recipes/{id}: Retrieve a specific recipe by ID.

POST /api/recipes: Create a new recipe.

PUT /api/recipes/{id}: Update an existing recipe.

DELETE /api/recipes/{id}: Delete a recipe.

GET /api/recipes/search?query=...: Search recipes.

AI Features:

GET /api/ai/suggest-recipe?ingredients=...&dietary=...: Get AI-generated recipe ideas.

GET /api/ai/substitute-ingredient?ingredient=...&contextRecipe=...: Get AI-suggested ingredient substitutes.

POST /api/ai/scale-recipe: Scale recipe ingredients with AI.

POST /api/ai/refine-instructions: Get AI-improved recipe instructions.

GET /api/ai/assess-difficulty?recipeContent=...: Get AI-assessed recipe difficulty.

(Provide more specific endpoint paths, request bodies, and response examples if you have them ready.)

Future Enhancements
Enhanced AI Capabilities:

Semantic Search: Using pgvector for more intelligent recipe searching based on natural language queries.

Automated Nutritional Information: AI-driven estimation of calories, macros, etc.

AI-Powered Meal Planning: Generate full meal plans for a week based on user preferences and ingredients.

Shopping List Generation: Automatically create shopping lists from planned meals.

User Profiles & Preferences: Deeper personalization.

Image Upload & Management: Direct image uploads for recipes to cloud storage (e.g., AWS S3).

User Reviews & Ratings: Allow users to rate and review recipes.

Public Recipe Sharing: Functionality to share recipes with other users or publicly.

Deployment: Deploying the application to a cloud platform (e.g., Heroku, AWS Elastic Beanstalk, Render).

Contributing
Contributions are welcome! If you'd like to contribute, please follow these steps:

Fork the repository.

Create a new branch (git checkout -b feature/your-feature-name).

Make your changes.

Commit your changes (git commit -m 'Add new feature').

Push to the branch (git push origin feature/your-feature-name).

Open a Pull Request.

License
This project is licensed under the apachelicense
