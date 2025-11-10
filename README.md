# Android-Apps

Collection of small Android example projects and UI samples used for learning Android app development.

Repository layout (top-level folders):

- `Activity Lifecycle/` — sample demonstrating activity lifecycle callbacks
- `AlertBox/` — simple alert dialog example
- `calculator/` — basic calculator UI and logic
- `explicit intents/` — (examples using explicit intents)
- `multiple activities/` — sample showing navigation between activities
- `option menu/` — example of options menu and menu items
- `Spinners/` — spinner (drop-down) UI example
- `toggles/` — toggle button examples
- `ui_facebook/` — UI layout inspired by a social app
- `validations UI controls/` — UI controls with basic validation

These folders contain source files (XML layouts and Java source) for quick experiments. Not every folder may be a complete Gradle project; many are small samples intended to be imported into an Android Studio project or copied into a module.

## Quick start

Option A — Open in Android Studio (recommended):

1. Open Android Studio.
2. Use "Open" and select the sample folder you want to try (for example `multiple activities`). If the folder is a runnable Gradle project, Android Studio will import it.
3. If the sample is only source files (no Gradle files), create a new Android Studio project and copy the sample's `java/` files into `app/src/main/java` and its layout XML files into `app/src/main/res/layout`.
4. Connect an Android device or start an emulator, then Run the app from Android Studio.

Option B — Use the command-line (only for projects with Gradle wrapper):

1. Open a terminal in the project folder (the folder must have `gradlew` and Gradle build files).
2. Build:

   On Windows (cmd.exe):

   ```cmd
   gradlew assembleDebug
   ```

3. Install to an attached device/emulator:

   ```cmd
   gradlew installDebug
   ```

If a sample isn't a complete Gradle project, prefer Option A and import/copy files into a new project as described above.

## Git & repository notes

- This repository's default branch is `main` and an initial commit has been pushed.
- To view status and remote info:

  ```cmd
  git status
  git branch -vv
  git remote -v
  ```

- If you haven't already, consider adding a `.gitignore` for Android projects. I can add a standard one for you (recommended).

## Suggestions / Next steps

- Add a standard Android `.gitignore` to avoid committing IDE/build artifacts.
- If you want each sample to be a runnable Gradle module, I can scaffold minimal `build.gradle` files and a top-level settings file.
- Add README files inside larger sample folders (e.g., `multiple activities/README.md`) describing the activity flow and how to run that specific sample.

## License

This repository is provided under the MIT License — see `LICENSE` (or tell me if you'd like a different license and I will add it).

---

If you'd like, I can now add a standard Android `.gitignore` and/or create a top-level `settings.gradle` and `build.gradle` to make each sample importable as modules. Which would you prefer?
