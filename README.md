# Library App / Small_Library_App

## Description
This is a JavaFX-based library application where users can view, buy, or borrow books and CDs. It also includes a simple cart and process system to manage purchases and borrowings.

**Note from owner:** The UI is quite a bit messy, but it does its work as an application. Enjoy!

## Features
- Login system with name and money input.
- View, borrow, and buy books and CDs.
- Add items to cart and view them.
- Process checkout and calculate totals.
- Navigation between menu, books, CDs, cart, and process pages.

## Classes
- **Item.java** – Base class for items with attributes like title, author, type/genre, original price, and borrow price.
- **Book.java** – Subclass of Item.
- **CD.java** – Subclass of Item.
- **Member.java** – Represents the user with name and current money.
- **Cart.java** – Manages borrowed and purchased items.
- **Inventory.java** – Stores the list of books and CDs available.
- **Main.java** – Main JavaFX application, handles UI and event handling.

## Requirements
- Java JDK 8 or higher
- JavaFX library
- Check here:([link](https://gluonhq.com/products/javafx/))

## How to Clone

1. Open your terminal (Git Bash, Command Prompt, or Terminal).
2. Navigate to the folder where you want to clone the repository.
3. Run the following command:

```bash
git clone https://github.com/your-username/library-app.git
```
## Future Improvements
- Coming soon...
