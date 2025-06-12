# Documentation Setup


Now that your `practice-java` project is set up, integrating a Docusaurus site inside it is a great way to build documentation alongside your codebase.

Here’s how you can scaffold a Docusaurus project **inside** the `practice-java` folder, under a subdirectory like `docs`:

---

### 📘 Step-by-Step: Create a Docusaurus Site in `practice-java/docs`

1. **Navigate to your Java project folder**:
   ```bash
   cd practice-java
   ```

2. **Create the Docusaurus site inside a `docs` folder**:
   ```bash
    pnpm create docusaurus
   ```

   This will scaffold the Docusaurus site in `practice-java/docs`.

3. **Install dependencies**:
   ```bash
   cd docs
   pnpm install
   ```

4. **Run the Docusaurus dev server**:
   ```bash
   pnpm run start
   ```

   Your docs will be live at [http://localhost:3000](http://localhost:3000) and hot-reloaded as you edit!

5. **Customize the content**:
   - Edit `docs/intro.md` or add new Markdown files.
   - Update the sidebar in `sidebars.js`.
   - Tweak styling and config in `docusaurus.config.js`.

---

This structure cleanly separates your backend code from your documentation frontend, which makes it easier to containerize later if you want. Want to take it up a notch and wire this into a Docker Compose workflow with your Spring Boot app? I'd love to help you get that rolling. 🚀
