package libraryManagement;

public class Library {
			
			//private attributes 
			private String bookName;
			private String authorName;
			private long edition;
			private int noOfCopies;
			private String journal;
			private int bookId;



			// public getter and setter methods for the above mentioned attributes
			public int getbookId() {
				return bookId;
			}
			public void setbookId(int bookId) {
				this.bookId=bookId;
			}


			public String getbookName() {
				return bookName;
			}
			public void setbookName(String bookName) {
				this.bookName=bookName;
			}


			public String getauthorName() {
				return authorName;
			}
			public void setauthorName(String authorName) {
				this.authorName=authorName;
			}


			public long getedition() {
				return edition;
			}
			public void setedition(int edition) {
				this.edition=edition;
			}


			public int getnoOfCopies() {
				return noOfCopies;
			}
			public void setnoOfCopies(byte noOfCopies) {
				this.noOfCopies=noOfCopies;
			}


			public String getjournal() {
				return journal;
			}
			public void setjournal(String journal) {
				this.journal=journal;
			}

		 static void toCheckLogin(String username,String password) throws Exception {

				if(username.equals("LibraryManagement") && password.equals("library@123")) {
					System.out.println("Logged In Successfully");
					DriverClass.toCheckCases();
				}
				else {
					System.out.println("Please Enter the correct Login Credentials!");
				}
			}
		 static void toLogout() {
			 System.out.println("Logged Out Successfully ");
				System.out.println("Thank you for visiting");
		 }

		}
		

