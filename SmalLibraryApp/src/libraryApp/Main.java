package libraryApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	
	private String status;
	private int choice = 0;
	private int firstCount = 0;
	private int secondCount = 1;
	private int thirdCount = 2;
	
    Inventory inventory = new Inventory();
    Cart cart = new Cart();
	Member member = new Member();


	@Override
	public void start(Stage primaryStage) {

//LOGIN PAGE =========================================================================================

		Label title = new Label("Public Library");
		title.setFont(Font.font(60));
		title.setStyle("-fx-text-fill: white;");

		HBox topBox = new HBox(title);
		topBox.setAlignment(Pos.CENTER);
		topBox.setPadding(new Insets(30));

		Label nameLabel = new Label("Name");
		Label moneyLabel = new Label("Money");
		Label noteLabel = new Label("Hello!!!");

		nameLabel.setFont(Font.font(30));
		moneyLabel.setFont(Font.font(30));
		noteLabel.setFont(Font.font(20));
		noteLabel.setStyle("-fx-text-fill: white;");
		nameLabel.setStyle("-fx-text-fill: white;");
		moneyLabel.setStyle("-fx-text-fill: white;");
		

		TextField nameField = new TextField();
		TextField moneyField = new TextField();

		nameField.setPrefWidth(200);
		moneyField.setPrefWidth(200);

		nameLabel.setMinWidth(100);
		moneyLabel.setMinWidth(100);
		nameLabel.setAlignment(Pos.CENTER_RIGHT);
		moneyLabel.setAlignment(Pos.CENTER_RIGHT);
		noteLabel.setAlignment(Pos.CENTER_RIGHT);

		VBox labelBox = new VBox(25, nameLabel, moneyLabel);
		VBox fieldBox = new VBox(25, nameField, moneyField);

		HBox centerBox = new HBox(30, labelBox, fieldBox);
		centerBox.setAlignment(Pos.CENTER);
		centerBox.setPadding(new Insets(40));
		
		VBox centerLayout = new VBox(30, centerBox, noteLabel);
		centerLayout.setAlignment(Pos.CENTER);

		Button startButton = new Button("Start");
		Button endButton = new Button("End");

		HBox bottomBox = new HBox(20, startButton, endButton);
		bottomBox.setAlignment(Pos.CENTER);
		bottomBox.setPadding(new Insets(30));

		BorderPane loginLayout = new BorderPane();
		loginLayout.setTop(topBox);
		loginLayout.setCenter(centerLayout);
		loginLayout.setBottom(bottomBox);
	    
	    
//MENU PAGE =========================================================================================
	    
	    Label welcomeLabel = new Label("Welcome");
	    Button bookButton = new Button("View Book");
	    Button cdButton = new Button("View CD");
	    Button cartButton = new Button("View Cart");
	    Button processButton = new Button("View Process");
	    Button menuReturnButton = new Button("Return");
	    
	    
	    VBox menuButtonBox = new VBox(20, bookButton, cdButton, cartButton, processButton, menuReturnButton);
	    VBox welcomeBox = new VBox(20, welcomeLabel);
	    menuButtonBox.setAlignment(Pos.CENTER);
	    welcomeBox.setAlignment(Pos.CENTER);

	    BorderPane menuLayout = new BorderPane();
	    menuLayout.setTop(welcomeBox);
	    menuLayout.setCenter(menuButtonBox);
		
//VIEW BOOK PAGE =========================================================================================

		Button nextBook = new Button("Next");
		Button previousBook = new Button("Previous");
		Label bookFirstDisplay = new Label();
		Label bookSecondDisplay = new Label();
		Label bookThirdDisplay = new Label();
		
		Button firstBookChoice = new Button("1");
		Button secondBookChoice = new Button("2");
		Button thirdBookChoice = new Button("3");
		
		
		Button borrowBookButton = new Button("Borrow");
		Button buyBookButton = new Button("Buy");
		Button bookReturnButton = new Button("Return");
		Button bookAddCartButton = new Button("Add Cart");
		
		
		HBox bookChoiceBox = new HBox(20, firstBookChoice, secondBookChoice, thirdBookChoice);
		bookChoiceBox.setAlignment(Pos.CENTER);

		HBox processButtonBox = new HBox(20, borrowBookButton, buyBookButton, bookAddCartButton);
	    processButtonBox.setAlignment(Pos.CENTER);

		VBox returnBookBox = new VBox(20, processButtonBox, bookReturnButton);
		returnBookBox.setAlignment(Pos.CENTER);

		HBox bookAllDisplay = new HBox(20, previousBook, bookFirstDisplay, bookSecondDisplay, bookThirdDisplay, nextBook);
	    bookAllDisplay.setAlignment(Pos.CENTER);
	    
	    VBox bookEverything = new VBox(20, bookAllDisplay, bookChoiceBox, returnBookBox);
	    bookEverything.setAlignment(Pos.CENTER);

		BorderPane bookSceneLayout = new BorderPane();
		bookSceneLayout.setCenter(bookEverything);
//VIEW CD PAGE =========================================================================================
		
		Button nextCD = new Button("Next");
		Button previousCD = new Button("Previous");
		Label cdFirstDisplay = new Label();
		Label cdSecondDisplay = new Label();
		Label cdThirdDisplay = new Label();
		
		Button firstCDChoice = new Button("1");
		Button secondCDChoice = new Button("2");
		Button thirdCDChoice = new Button("3");
		
		
		Button borrowCDButton = new Button("Borrow");
		Button buyCDButton = new Button("Buy");
		Button cdReturnButton = new Button("Return");
		Button cdAddCartButton = new Button("Add Cart");
		
		
		HBox cdChoiceBox = new HBox(20, firstCDChoice, secondCDChoice, thirdCDChoice);
		cdChoiceBox.setAlignment(Pos.CENTER);

		HBox processCDButtonBox = new HBox(20, borrowCDButton, buyCDButton, cdAddCartButton);
		processCDButtonBox.setAlignment(Pos.CENTER);

		VBox returnCDBox = new VBox(20, processCDButtonBox, cdReturnButton);
		returnCDBox.setAlignment(Pos.CENTER);

		HBox cdAllDisplay = new HBox(20, previousCD, cdFirstDisplay, cdSecondDisplay, cdThirdDisplay, nextCD);
		cdAllDisplay.setAlignment(Pos.CENTER);
	    
	    VBox cdEverything = new VBox(20, cdAllDisplay, cdChoiceBox, returnCDBox);
	    cdEverything.setAlignment(Pos.CENTER);

		BorderPane cdSceneLayout = new BorderPane();
		cdSceneLayout.setCenter(cdEverything);

//VIEW CART PAGE =========================================================================================

		Label cartLabel = new Label("Your Cart");
		Button cartBuyBookButton = new Button("View Buy Book");
		Button cartBorrowBookButton = new Button("View Borrow Book");
		Button cartBuyCDButton = new Button("View Buy CD");
		Button cartBorrowCDButton = new Button("View Borrow CD");
		Button cartReturnButton = new Button("Return");
		
		VBox cartBox = new VBox(20, cartLabel, cartBuyBookButton,cartBorrowBookButton,cartBuyCDButton,cartBorrowCDButton, cartReturnButton);
		cartBox.setAlignment(Pos.CENTER);
		
		BorderPane cartSceneLayout = new BorderPane();
		cartSceneLayout.setCenter(cartBox);
		
//VIEW CART-BUY-BOOK PAGE =========================================================================================

		Button nextBuyBook = new Button("Next");
		Button previousBuyBook = new Button("Previous");
		Label bookBuyFirstDisplay = new Label();
		Label bookBuySecondDisplay = new Label();
		Label bookBuyThirdDisplay = new Label();
		
		Button firstBuyBookChoice = new Button("1");
		Button secondBuyBookChoice = new Button("2");
		Button thirdBuyBookChoice = new Button("3");
		Button bookBuyDeleteButton = new Button("Detele Buy Book");
		Button bookBuyReturnButton = new Button("Return");
		bookBuyReturnButton.setAlignment(Pos.CENTER);
		
		HBox bookBuyChoiceBox = new HBox(20, firstBuyBookChoice, secondBuyBookChoice, thirdBuyBookChoice, bookBuyDeleteButton);
		bookBuyChoiceBox.setAlignment(Pos.CENTER);
		
		HBox bookBuyAllDisplay = new HBox(20, previousBuyBook, bookBuyFirstDisplay, bookBuySecondDisplay, bookBuyThirdDisplay, nextBuyBook);
	    bookBuyAllDisplay.setAlignment(Pos.CENTER);
		
	    VBox bookBuyEverything = new VBox(20, bookBuyAllDisplay, bookBuyChoiceBox, bookBuyReturnButton);
	    bookBuyEverything.setAlignment(Pos.CENTER);
	    
	    BorderPane cartBuyBookSceneLayout = new BorderPane();
	    cartBuyBookSceneLayout.setCenter(bookBuyEverything);
//VIEW CART-BORROW-BOOK PAGE =========================================================================================
	    
	    Button nextBorrowBook = new Button("Next");
		Button previousBorrowBook = new Button("Previous");
		Label bookBorrowFirstDisplay = new Label();
		Label bookBorrowSecondDisplay = new Label();
		Label bookBorrowThirdDisplay = new Label();
		
		Button firstBorrowBookChoice = new Button("1");
		Button secondBorrowBookChoice = new Button("2");
		Button thirdBorrowBookChoice = new Button("3");
		Button bookBorrowDeleteButton = new Button("Detele Borrow Book");
		Button bookBorrowReturnButton = new Button("Return");
		bookBorrowReturnButton.setAlignment(Pos.CENTER);
		
		HBox bookBorrowChoiceBox = new HBox(20, firstBorrowBookChoice, secondBorrowBookChoice, thirdBorrowBookChoice, bookBorrowDeleteButton);
		bookBorrowChoiceBox.setAlignment(Pos.CENTER);
		
		HBox bookBorrowAllDisplay = new HBox(20, previousBorrowBook, bookBorrowFirstDisplay, bookBorrowSecondDisplay, bookBorrowThirdDisplay, nextBorrowBook);
	    bookBorrowAllDisplay.setAlignment(Pos.CENTER);
		
	    VBox bookBorrowEverything = new VBox(20, bookBorrowAllDisplay, bookBorrowChoiceBox, bookBorrowReturnButton);
	    bookBorrowEverything.setAlignment(Pos.CENTER);
	    
	    BorderPane cartBorrowBookSceneLayout = new BorderPane();
	    cartBorrowBookSceneLayout.setCenter(bookBorrowEverything);
		
//VIEW CART-BUY-CD PAGE =========================================================================================

  		Button nextBuyCD = new Button("Next");
  		Button previousBuyCD = new Button("Previous");
  		Label cdBuyFirstDisplay = new Label();
  		Label cdBuySecondDisplay = new Label();
  		Label cdBuyThirdDisplay = new Label();
  		
  		Button firstBuyCDChoice = new Button("1");
  		Button secondBuyCDChoice = new Button("2");
  		Button thirdBuyCDChoice = new Button("3");
  		Button cdBuyDeleteButton = new Button("Detele Buy CD");
  		Button cdBuyReturnButton = new Button("Return");
  		cdBuyReturnButton.setAlignment(Pos.CENTER);
  		
  		HBox cdBuyChoiceBox = new HBox(20, firstBuyCDChoice, secondBuyCDChoice, thirdBuyCDChoice, cdBuyDeleteButton);
  		cdBuyChoiceBox.setAlignment(Pos.CENTER);
  		
  		HBox cdBuyAllDisplay = new HBox(20, previousBuyCD, cdBuyFirstDisplay, cdBuySecondDisplay, cdBuyThirdDisplay, nextBuyCD);
  	    cdBuyAllDisplay.setAlignment(Pos.CENTER);
  		
  	    VBox cdBuyEverything = new VBox(20, cdBuyAllDisplay, cdBuyChoiceBox, cdBuyReturnButton);
  	    cdBuyEverything.setAlignment(Pos.CENTER);
  	    
  	    BorderPane cartBuyCDSceneLayout = new BorderPane();
  	    cartBuyCDSceneLayout.setCenter(cdBuyEverything);
  	    
 //VIEW CART-BORROW-CD PAGE =========================================================================================
  	    
  	    Button nextBorrowCD = new Button("Next");
  		Button previousBorrowCD = new Button("Previous");
  		Label cdBorrowFirstDisplay = new Label();
  		Label cdBorrowSecondDisplay = new Label();
  		Label cdBorrowThirdDisplay = new Label();
  		
  		Button firstBorrowCDChoice = new Button("1");
  		Button secondBorrowCDChoice = new Button("2");
  		Button thirdBorrowCDChoice = new Button("3");
  		Button cdBorrowDeleteButton = new Button("Detele Borrow CD");
  		Button cdBorrowReturnButton = new Button("Return");
  		cdBorrowReturnButton.setAlignment(Pos.CENTER);
  		
  		HBox cdBorrowChoiceBox = new HBox(20, firstBorrowCDChoice, secondBorrowCDChoice, thirdBorrowCDChoice, cdBorrowDeleteButton);
  		cdBorrowChoiceBox.setAlignment(Pos.CENTER);
  		
  		HBox cdBorrowAllDisplay = new HBox(20, previousBorrowCD, cdBorrowFirstDisplay, cdBorrowSecondDisplay, cdBorrowThirdDisplay, nextBorrowCD);
  	    cdBorrowAllDisplay.setAlignment(Pos.CENTER);
  		
  	    VBox cdBorrowEverything = new VBox(20, cdBorrowAllDisplay, cdBorrowChoiceBox, cdBorrowReturnButton);
  	    cdBorrowEverything.setAlignment(Pos.CENTER);
  	    
  	    BorderPane cartBorrowCDSceneLayout = new BorderPane();
  	    cartBorrowCDSceneLayout.setCenter(cdBorrowEverything);
  	    
//VIEW PROCESS PAGE =========================================================================================
	
		Label processUserNameDisplay = new Label("Name");
		Label processUserMoneyDisplay = new Label("Money");
		
		Label buyBookDisplay = new Label("Buy Book");
		Label borrowBookDisplay = new Label("Borrow Book");
		Label buyCDDisplay = new Label("Buy CD");
		Label borrowCDDisplay = new Label("Borrow CD");
		
		Label buyBookTotalDisplay = new Label("Total");
		Label borrowBookTotalDisplay = new Label("Total");
		Label buyCDTotalDisplay = new Label("Total");
		Label borrowCDTotalDisplay = new Label("Total");
				
		Button processReturnButton = new Button("Return");
		Button processProcessButton = new Button("Process");
		
		HBox processBottomButtonBox = new HBox(20, processReturnButton, processProcessButton);
		processBottomButtonBox.setAlignment(Pos.CENTER);
		
		HBox processBookBox = new HBox(20, buyBookDisplay, borrowBookDisplay);
		processBookBox.setAlignment(Pos.CENTER);
		HBox processBookTotalBox = new HBox(20, buyBookTotalDisplay, borrowBookTotalDisplay);
		processBookTotalBox.setAlignment(Pos.CENTER);

		HBox processCDBox = new HBox(20, buyCDDisplay, borrowCDDisplay);
		processCDBox.setAlignment(Pos.CENTER);

		HBox processCDTotalBox = new HBox(20, buyCDTotalDisplay, borrowCDTotalDisplay);
		processCDTotalBox.setAlignment(Pos.CENTER);

		VBox processLeftBox = new VBox(20, processUserNameDisplay, processBookBox, processBookTotalBox);
		processLeftBox.setAlignment(Pos.CENTER);

		VBox processRightBox = new VBox(20, processUserMoneyDisplay, processCDBox, processCDTotalBox);
		processRightBox.setAlignment(Pos.CENTER);
		
		HBox processCenterBox = new HBox(20, processLeftBox, processRightBox);
		processCenterBox.setAlignment(Pos.CENTER);

		VBox processDisplay = new VBox(20, processCenterBox, processBottomButtonBox);
		processDisplay.setAlignment(Pos.CENTER);

		BorderPane processSceneLayout = new BorderPane();
		processSceneLayout.setCenter(processDisplay);
//VIEW PROCESS-FINAL-CALCULATE++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		Label receiptTitleLabel = new Label("Receipt");
		Label receiptDisplay = new Label("Display");
		Button cancelButton = new Button("Cancel");
		Button startOverButton = new Button("Start Over");
		
		HBox calculateButtonBox = new HBox(20, cancelButton, startOverButton);
		calculateButtonBox.setAlignment(Pos.CENTER);
		
		VBox calculateCenterBox = new VBox(20, receiptTitleLabel, receiptDisplay, calculateButtonBox);
		calculateCenterBox.setAlignment(Pos.CENTER);
		
		BorderPane calculateSceneLayout = new BorderPane();
		calculateSceneLayout.setCenter(calculateCenterBox);
		
	    
//SCENE ORDER+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Status: Almost
	    
	    Scene loginScene = new Scene(loginLayout, 600, 600);
	    Scene menuScene = new Scene(menuLayout, 500, 600);
	    Scene bookScene = new Scene(bookSceneLayout, 600,600);
	    Scene cdScene = new Scene(cdSceneLayout, 600,600);
	    
	    Scene cartScene = new Scene(cartSceneLayout, 600,600);
	    Scene cartBuyBookScene = new Scene(cartBuyBookSceneLayout, 600, 600);
	    Scene cartBorrowBookScene = new Scene(cartBorrowBookSceneLayout, 600, 600);
	    Scene cartBuyCDScene = new Scene(cartBuyCDSceneLayout, 600, 600);
	    Scene cartBorrowCDScene = new Scene(cartBorrowCDSceneLayout, 600, 600);
	

	    
	    Scene processScene = new Scene(processSceneLayout, 600,600);
	    Scene receiptScene = new Scene(calculateSceneLayout, 600, 600);
	    
		loginLayout.setStyle("-fx-background-color: orange;");
		menuLayout.setStyle("-fx-background-color: orange;");
		bookSceneLayout.setStyle("-fx-background-color: orange;");
		cdSceneLayout.setStyle("-fx-background-color: orange;");
		cartSceneLayout.setStyle("-fx-background-color: orange;");
		cartBuyBookSceneLayout.setStyle("-fx-background-color: orange;");
		cartBorrowBookSceneLayout.setStyle("-fx-background-color: orange;");
		processSceneLayout.setStyle("-fx-background-color: orange;");
		calculateSceneLayout.setStyle("-fx-background-color: orange;");



//LOGIN SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	    
		
		
		startButton.setOnAction(e -> {
	    	
			Double userMoney = Double.parseDouble(moneyField.getText());
	    	String userName = nameField.getText();
	    	boolean isValidName = true;
	    	boolean moneyTrue = false;
	    	boolean nameTrue = false;

	    	for (int i = 0; i < userName.length(); i++) {
	    	    if (!Character.isLetter(userName.charAt(i))) {
	    	        isValidName = false;
	    	        break;
	    	    }
	    	}

	    	if (isValidName == false) {
	    	    noteLabel.setText("Name must contain letters only");
	    	} else {
	    	    member.setName(userName);
	    	    nameTrue = true;
	    	}

	    	
	    	
			if (userMoney <= 0) {
				noteLabel.setText("Please enter your credit above negative number and 0");
				
			} else {
		   
		    	member.setCurrentMoney(userMoney);
		    	moneyTrue = true;
			}
			
			
			if (moneyTrue && nameTrue) {
		    	primaryStage.setScene(menuScene);

			}
			
		    System.out.println(member.toString());

	    	   
		});
		
	    
//MENU SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Status: DONE
	    bookButton.setOnAction(e -> {
	    	
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "";
	    	bookFirstDisplay.setText(inventory.getBook(0).toString());
	    	bookSecondDisplay.setText(inventory.getBook(1).toString());
	    	bookThirdDisplay.setText(inventory.getBook(2).toString());
	    	primaryStage.setScene(bookScene);
	    });
	    
	    cdButton.setOnAction(e -> {
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "";
	    	cdFirstDisplay.setText(inventory.getCD(0).toString());
	    	cdSecondDisplay.setText(inventory.getCD(1).toString());
	    	cdThirdDisplay.setText(inventory.getCD(2).toString());
	    	primaryStage.setScene(cdScene);

	    });
	    
	    cartButton.setOnAction(e -> primaryStage.setScene(cartScene));
	    
	    processButton.setOnAction(e -> {primaryStage.setScene(processScene);
	    
	    	String moneyString = Double.toString(member.getCurrentMoney());
	    	
	    	processUserNameDisplay.setText("User Name: " + member.getName());
	    	processUserMoneyDisplay.setText("User Money: $" + moneyString);
	    
	    	if (cart.printAllProcessBuyBooks() == "") {
	    		buyBookDisplay.setText("Empty");
	    		buyBookTotalDisplay.setText("Total: 0 Book");
	    	} else {
		    	buyBookDisplay.setText(cart.printAllProcessBuyBooks());
		    	buyBookTotalDisplay.setText("Total: " + cart.returnTotalBuyBooks() + " Books");
	    	}
	    	
	    	if (cart.printAllProcessBorrowBooks() == "") {
	    		borrowBookDisplay.setText("Empty");
	    		borrowBookTotalDisplay.setText("Total: 0");
	    	} else {
	    		borrowBookDisplay.setText(cart.printAllProcessBorrowBooks());
		    	borrowBookTotalDisplay.setText("Total: " + cart.returnTotalBorrowBooks() + " Books");
	    	}
	    	
	    	if (cart.printAllProcessBuyCDs() == "") {
	    		buyCDDisplay.setText("Empty");
	    		buyCDTotalDisplay.setText("Total: 0");
	    	} else {
		    	buyCDDisplay.setText(cart.printAllProcessBuyCDs());
		    	buyCDTotalDisplay.setText("Total: " + cart.returnTotalBuyCDs() + " CDs");
	    	}
	    	
	    	if (cart.printAllProcessBorrowCDs() == "") {
	    		borrowCDDisplay.setText("Empty");
	    		borrowCDTotalDisplay.setText("Total: 0");
	    	} else {
	    		borrowCDDisplay.setText(cart.printAllProcessBorrowCDs());
		    	borrowCDTotalDisplay.setText("Total: " + cart.returnTotalBorrowCDs() + " CDs");
	    	}
	    	
	    	
	    });
	    menuReturnButton.setOnAction(e -> primaryStage.setScene(loginScene));
	    
	    
	    
//BOOK SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Status: DONE
	    nextBook.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	bookFirstDisplay.setText(inventory.getBook(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		bookFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	bookSecondDisplay.setText(inventory.getBook(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	bookSecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	bookThirdDisplay.setText(inventory.getBook(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	bookThirdDisplay.setText("Empty");
		    
	    	}
	    	//0 - 1 - 2
	    	//3 - 4 - 5
	    	
	    });
	    
	    previousBook.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	bookFirstDisplay.setText(inventory.getBook(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	bookSecondDisplay.setText(inventory.getBook(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	bookThirdDisplay.setText(inventory.getBook(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstBookChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondBookChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdBookChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    borrowBookButton.setOnAction(e -> {
	    	status = "borrow";
	    	System.out.println("Current status:" + status);

	    });
	    
	    buyBookButton.setOnAction(e -> {
	    	status = "buy";
	    	System.out.println("Current status:" + status);

	    });
	    
	    bookAddCartButton.setOnAction(e -> {
	    	if (choice == 1 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(firstCount));
	    	    cart.addBorrowedBook(inventory.getBook(firstCount));
	    	} 
	    	else if (choice == 2 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(secondCount));
	    	    cart.addBorrowedBook(inventory.getBook(secondCount));
	    	} 
	    	else if (choice == 3 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(thirdCount));
	    	    cart.addBorrowedBook(inventory.getBook(thirdCount));
	    	} 
	    	else if (choice == 1 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(firstCount));
	    	    cart.addBuyBook(inventory.getBook(firstCount));
	    	} 
	    	else if (choice == 2 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(secondCount));
	    	    cart.addBuyBook(inventory.getBook(secondCount));
	    	}
	    	else if (choice == 3 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(thirdCount));
	    	    cart.addBuyBook(inventory.getBook(thirdCount));

	    	}
	    	
	    	System.out.println("Buy book ========");
	    	cart.printAllBuyBooks();
	    	System.out.println("Borrow book ========");
	    	cart.printAllBorrowBooks();
	    	
	    });
	    
	    bookReturnButton.setOnAction(e -> primaryStage.setScene(menuScene));

	    
//BOOK SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Status: DONE	    
	    
	    nextCD.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	cdFirstDisplay.setText(inventory.getCD(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		cdFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	cdSecondDisplay.setText(inventory.getCD(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	cdSecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	cdThirdDisplay.setText(inventory.getCD(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	cdThirdDisplay.setText("Empty");
		    
	    	}
	    	//0 - 1 - 2
	    	//3 - 4 - 5
	    	
	    });
	    
	    previousCD.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	cdFirstDisplay.setText(inventory.getCD(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	cdSecondDisplay.setText(inventory.getCD(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	cdThirdDisplay.setText(inventory.getCD(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstCDChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondCDChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdCDChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    borrowCDButton.setOnAction(e -> {
	    	status = "borrow";
	    	System.out.println("Current status:" + status);

	    });
	    
	    buyCDButton.setOnAction(e -> {
	    	status = "buy";
	    	System.out.println("Current status:" + status);

	    });
	    
	    cdAddCartButton.setOnAction(e -> {
	    	if (choice == 1 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(firstCount));
	    	    cart.addBorrowedCD(inventory.getCD(firstCount));
	    	} 
	    	else if (choice == 2 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(secondCount));
	    	    cart.addBorrowedCD(inventory.getCD(secondCount));
	    	} 
	    	else if (choice == 3 && status == "borrow") {
	    	    //cart.addBook(inventory.getBook(thirdCount));
	    	    cart.addBorrowedCD(inventory.getCD(thirdCount));
	    	} 
	    	else if (choice == 1 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(firstCount));
	    	    cart.addBuyCD(inventory.getCD(firstCount));
	    	} 
	    	else if (choice == 2 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(secondCount));
	    	    cart.addBuyCD(inventory.getCD(secondCount));
	    	}
	    	else if (choice == 3 && status == "buy") {
	    	    //cart.addBook(inventory.getBook(thirdCount));
	    	    cart.addBuyCD(inventory.getCD(thirdCount));

	    	}
	    	
	    	System.out.println("Buy CD ========");
	    	cart.printAllBuyCDs();
	    	System.out.println("Borrow CD ========");
	    	cart.printAllBorrowCDs();
	    	
	    });
	    
	    cdReturnButton.setOnAction(e -> primaryStage.setScene(menuScene));
	    
//CART SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	    cartBuyBookButton.setOnAction(e -> {

	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";
	    	primaryStage.setScene(cartBuyBookScene);
	    	try {
	    		bookBuyFirstDisplay.setText(cart.getBuyBook(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuyFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBuySecondDisplay.setText(cart.getBuyBook(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuySecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBuyThirdDisplay.setText(cart.getBuyBook(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuyThirdDisplay.setText("Empty");
	    	}

	    });
	    
	    cartBorrowBookButton.setOnAction(e -> {

	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";
	    	primaryStage.setScene(cartBorrowBookScene);
	    	try {
	    		bookBorrowFirstDisplay.setText(cart.getBorrowBook(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBorrowSecondDisplay.setText(cart.getBorrowBook(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowSecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBorrowThirdDisplay.setText(cart.getBorrowBook(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowThirdDisplay.setText("Empty");
	    	}

	    });
	    
	    cartBuyCDButton.setOnAction(e -> {

	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";
	    	primaryStage.setScene(cartBuyCDScene);
	    	try {
	    		cdBuyFirstDisplay.setText(cart.getBuyCD(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuyFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBuySecondDisplay.setText(cart.getBuyCD(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuySecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBuyThirdDisplay.setText(cart.getBuyCD(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuyThirdDisplay.setText("Empty");
	    	}

	    });
	    
	    cartBorrowCDButton.setOnAction(e -> {

	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";
	    	primaryStage.setScene(cartBorrowCDScene);
	    	try {
	    		cdBorrowFirstDisplay.setText(cart.getBorrowCD(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBorrowFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBorrowSecondDisplay.setText(cart.getBorrowCD(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBorrowSecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBorrowThirdDisplay.setText(cart.getBorrowCD(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBorrowThirdDisplay.setText("Empty");
	    	}

	    });
	    
	    cartReturnButton.setOnAction(e -> primaryStage.setScene(menuScene));

	    
	    
//CART BUY BOOK SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    nextBuyBook.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	bookBuyFirstDisplay.setText(cart.getBuyBook(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		bookBuyFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	bookBuySecondDisplay.setText(cart.getBuyBook(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	bookBuySecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	bookBuyThirdDisplay.setText(cart.getBuyBook(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	bookBuyThirdDisplay.setText("Empty");
		    
	    	}
	    	
	    });
	    
	    previousBuyBook.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	bookBuyFirstDisplay.setText(cart.getBuyBook(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	bookBuySecondDisplay.setText(cart.getBuyBook(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	bookBuyThirdDisplay.setText(cart.getBuyBook(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstBuyBookChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondBuyBookChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdBuyBookChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    bookBuyDeleteButton.setOnAction(e -> {
	    	if (choice == 1) {
	    		cart.deleteBuyBook(firstCount);
	    	} else if (choice == 2) {
	    		cart.deleteBuyBook(secondCount);
	    	} else if (choice == 3) {
	    		cart.deleteBuyBook(thirdCount);
	    	} else {
	    		System.out.println("Nothing");
	    	}
	    	
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";

	    	try {
	    		bookBuyFirstDisplay.setText(cart.getBuyBook(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuyFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBuySecondDisplay.setText(cart.getBuyBook(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuySecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBuyThirdDisplay.setText(cart.getBuyBook(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBuyThirdDisplay.setText("Empty");
	    	}
	    });
	    
	    
	    bookBuyReturnButton.setOnAction(e -> primaryStage.setScene(cartScene));

//CART BORROW BOOK SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    nextBorrowBook.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	bookBorrowFirstDisplay.setText(cart.getBorrowBook(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		bookBorrowFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	bookBorrowSecondDisplay.setText(cart.getBorrowBook(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	bookBorrowSecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	bookBorrowThirdDisplay.setText(cart.getBorrowBook(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	bookBorrowThirdDisplay.setText("Empty");
		    
	    	}
	    	
	    });
	    
	    previousBorrowBook.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	bookBorrowFirstDisplay.setText(cart.getBorrowBook(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	bookBorrowSecondDisplay.setText(cart.getBorrowBook(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	bookBorrowThirdDisplay.setText(cart.getBorrowBook(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstBorrowBookChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondBorrowBookChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdBorrowBookChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    bookBorrowDeleteButton.setOnAction(e -> {
	    	if (choice == 1) {
	    		cart.deleteBorrowBook(firstCount);
	    	} else if (choice == 2) {
	    		cart.deleteBorrowBook(secondCount);
	    	} else if (choice == 3) {
	    		cart.deleteBorrowBook(thirdCount);
	    	} else {
	    		System.out.println("Nothing");
	    	}
	    	
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";

	    	try {
	    		bookBorrowFirstDisplay.setText(cart.getBorrowBook(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBorrowSecondDisplay.setText(cart.getBorrowBook(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowSecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	bookBorrowThirdDisplay.setText(cart.getBorrowBook(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowThirdDisplay.setText("Empty");
	    	}
	    });
	    
	    
	    bookBorrowReturnButton.setOnAction(e -> primaryStage.setScene(cartScene));

//CART BUY CD SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    nextBuyCD.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	cdBuyFirstDisplay.setText(cart.getBuyCD(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		cdBuyFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	cdBuySecondDisplay.setText(cart.getBuyCD(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	cdBuySecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	cdBuyThirdDisplay.setText(cart.getBuyCD(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	cdBuyThirdDisplay.setText("Empty");
		    
	    	}
	    	
	    });
	    
	    previousBuyCD.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	cdBuyFirstDisplay.setText(cart.getBuyCD(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	cdBuySecondDisplay.setText(cart.getBuyCD(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	cdBuyThirdDisplay.setText(cart.getBuyCD(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstBuyCDChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondBuyCDChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdBuyCDChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    cdBuyDeleteButton.setOnAction(e -> {
	    	if (choice == 1) {
	    		cart.deleteBuyCD(firstCount);
	    	} else if (choice == 2) {
	    		cart.deleteBuyCD(secondCount);
	    	} else if (choice == 3) {
	    		cart.deleteBuyCD(thirdCount);
	    	} else {
	    		System.out.println("Nothing");
	    	}
	    	
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";

	    	try {
	    		cdBuyFirstDisplay.setText(cart.getBuyCD(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuyFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBuySecondDisplay.setText(cart.getBuyCD(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuySecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBuyThirdDisplay.setText(cart.getBuyCD(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBuyThirdDisplay.setText("Empty");
	    	}
	    });
	    
	    
	    cdBuyReturnButton.setOnAction(e -> primaryStage.setScene(cartScene));

//CART BORROW CD SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    nextBorrowCD.setOnAction(e -> {
	    	try {
	    		
		    	firstCount = firstCount + 3;
		    	cdBorrowFirstDisplay.setText(cart.getBorrowCD(firstCount).toString());
		    	System.out.println(firstCount);

	    	} catch (IndexOutOfBoundsException e1) {
	    		
	    		cdBorrowFirstDisplay.setText("Empty");

	    	}
	    	
	    	try {
	    		
		    	secondCount = secondCount + 3;
		    	cdBorrowSecondDisplay.setText(cart.getBorrowCD(secondCount).toString());
		    	System.out.println(secondCount);
		    	
	    	} catch (IndexOutOfBoundsException e1) {
	    		
		    	cdBorrowSecondDisplay.setText("Empty");

	    	}
	    	
	    	try {

		    	thirdCount = thirdCount  + 3;
		    	cdBorrowThirdDisplay.setText(cart.getBorrowCD(thirdCount).toString());
		    	System.out.println(thirdCount);
		    	System.out.println("============================");
		    	
	    	} catch (IndexOutOfBoundsException e1) {

		    	cdBorrowThirdDisplay.setText("Empty");
		    
	    	}
	    	
	    });
	    
	    previousBorrowCD.setOnAction(e -> {
	    	
	    	firstCount = firstCount - 3;
	    	secondCount = secondCount - 3;
	    	thirdCount = thirdCount  - 3;
	    	//bookThirdDisplay.setText(inventory.getBook(count).toString());
	    	cdBorrowFirstDisplay.setText(cart.getBorrowCD(firstCount).toString());

	    	//System.out.println(count);
	    	
	    	//count = count + 1;
	    	cdBorrowSecondDisplay.setText(cart.getBorrowCD(secondCount).toString());
	    	//System.out.println(count);

	    	//count = count + 1;
	    	cdBorrowThirdDisplay.setText(cart.getBorrowCD(thirdCount).toString());
	    	//bookFirstDisplay.setText(inventory.getBook(count).toString());
	    	//System.out.println(count);
	    	System.out.println(firstCount);
	    	System.out.println(secondCount);
	    	System.out.println(thirdCount);
	    	System.out.println("============================");
	    });
	    
	    firstBorrowCDChoice.setOnAction(e -> {
	    	choice = 1;
	    	System.out.println("Current Choice:" + choice);
	    });
	    
	    secondBorrowCDChoice.setOnAction(e -> {
	    	choice = 2;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    thirdBorrowCDChoice.setOnAction(e -> {
	    	choice = 3;
	    	System.out.println("Current Choice:" + choice);

	    });
	    
	    cdBorrowDeleteButton.setOnAction(e -> {
	    	if (choice == 1) {
	    		cart.deleteBorrowCD(firstCount);
	    	} else if (choice == 2) {
	    		cart.deleteBorrowCD(secondCount);
	    	} else if (choice == 3) {
	    		cart.deleteBorrowCD(thirdCount);
	    	} else {
	    		System.out.println("Nothing");
	    	}
	    	
	    	firstCount = 0;
	    	secondCount = 1;
	    	thirdCount = 2;
	    	choice = 0;
	    	status = "delete";

	    	try {
	    		cdBorrowFirstDisplay.setText(cart.getBorrowCD(0).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		bookBorrowFirstDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBorrowSecondDisplay.setText(cart.getBorrowCD(1).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBorrowSecondDisplay.setText("Empty");
	    	}
	    	
	    	try {
		    	cdBorrowThirdDisplay.setText(cart.getBorrowCD(2).toString());
	    	} catch (IndexOutOfBoundsException e1) {
	    		cdBorrowThirdDisplay.setText("Empty");
	    	}
	    });
	    
	    
	    cdBorrowReturnButton.setOnAction(e -> primaryStage.setScene(cartScene));
	    
//PROCESS SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    processReturnButton.setOnAction(e -> primaryStage.setScene(menuScene));
	    processProcessButton.setOnAction(e -> {
	    	
	    	receiptDisplay.setText(cart.printReceipt(member.getCurrentMoney(), member.getName()));
	    	
	    	
	    	
	    	primaryStage.setScene(receiptScene);
	    });

//RECEIPT SCENE BUTTONS FUNCTION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	    cancelButton.setOnAction(e -> primaryStage.setScene(processScene));
	    startOverButton.setOnAction(e -> {
	    	
	    	moneyField.clear();
	    	nameField.clear();
	    	cart.deteleAll();
	    	primaryStage.setScene(loginScene);
	    
	    });
	    
//END OF PROGRAM+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


	    primaryStage.setTitle("Library");
	    primaryStage.setScene(loginScene);
	    primaryStage.show();
	     
	    
	    
	    //--------------------------------------------------------------------------
	    Book book = new Book("Harry Potter", "unknow", "Magic", 32.12, 12.21);
	    System.out.println(book.toString());
	    
	    
	    
	    
	    
	    //cart.addBook(inventory.getBook(0));
	    System.out.println("=============================");
	    //cart.printAllBooks();
	    
	}

	
	public static void main(String[] args) {
        launch(args);
    }
}