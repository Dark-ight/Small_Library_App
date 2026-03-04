# Library App / Small_Library_App

## Description
This is a JavaFX-based library application where users can view, buy, or borrow books and CDs. It also includes a simple cart and process system to manage purchases and borrowings.

**Note from owner:** The UI is quite a bit messy, but it does its work as an application. Enjoy!

## Features
- Login system with name and money input.
- View, borrow, and buy books and CDs.
- Add items to the cart and view them.
- Process checkout and calculate totals.
- Navigation between menu, books, CDs, cart, and process pages.

## Classes
- **Item.java** – Base class for items with attributes like title, author, type/genre, original price, and borrow price.
- **Book.java** – Subclass of Item.
- **CD.java** – Subclass of Item.
- **Member.java** – Represents the user with a name and current money.
- **Cart.java** – Manages borrowed and purchased items.
- **Inventory.java** – Stores the list of books and CDs available.
- **Main.java** – Main JavaFX application, handles UI and event handling.

## Requirements
- Java JDK 8 or higher
- JavaFX library
- Check here: ([link](https://gluonhq.com/products/javafx/))

## How to Clone

1. Open your terminal (Git Bash, Command Prompt, or Terminal).
2. Navigate to the folder where you want to clone the repository.
3. Run the following command:

```bash
git clone https://github.com/your-username/Small_Library_App.git
```

## How to Run
1. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.).
2. Make sure Java JDK 8 or higher is installed.
3. Configure JavaFX in your IDE:
   - Download JavaFX SDK.
   - Add the JavaFX library to your project’s build path.
4. Run the application:
   - Run `libraryApp.Main` as a Java application.
   - **Note:** If you implement your JavaFX library and the application does not run, you must **locate your JavaFX SDK folder** and add it into the **VM arguments** in your IDE, for example:  
     `--module-path "path_to_javafx_lib" --add-modules javafx.controls,javafx.fxml`
     
## Notes
- Name input must contain letters only; money must be positive.
- The UI is basic but functional.
- Future improvements may include better styling, search, and filtering features.
  
## Future Improvements
- Coming soon...
