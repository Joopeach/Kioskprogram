package Controller;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;

import DAO.KitchenDao;
import DAO.ProductDao;
import domain.Cart;
import domain.Kitchen_Order;
import domain.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListController implements Initializable {

	@FXML
    private BorderPane borderpane;

    @FXML
    private AnchorPane cp;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;
    
    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Label lbl_1;

    @FXML
    private Label lbl_2;

    @FXML
    private Label lbl_3;
    
    @FXML
    private Label lbl_4;

    @FXML
    private Label lbl_5;


    @FXML
    private Button btncancel;

    @FXML
    private Button btnsuccess;
    
    private static ListController instance;
    
    public ListController() {
		instance = this;
	}
    
    public static ListController getinstance() {
    	
		return instance;
    }
    
    public ObservableList<Cart> getcart() {
		return carts;
	}
    
    public Kitchen_Order getorder() {
    	return order;
    }
    
    private static Kitchen_Order order;
    
    ProductDao productDao = ProductDao.getProductDao();
	
	ArrayList<Product> products = productDao.allproduct();

    ObservableList<Cart> carts= FXCollections.observableArrayList();
    
    @FXML
    void btn_1(ActionEvent event) {
    	
    	// ?????? ???? ???? ???? ????
     	Product sproduct = new Product();
    	
    	
    	for( Product product : products ) {
        	
			if( product.getPnum() ==  Integer.parseInt( btn_1.getText() ) ) {
				sproduct = product;
			}
    	}
  	
    	int s = 0 ;	// ??????
    	
    	if(  sproduct.getPnum() == Integer.parseInt( btn_1.getText( ))  ) {
    		
    		for(  int i = 0 ; i<carts.size() ; i++  ) {
    			
    			if( carts.get(i).getTitle().equals(sproduct.getPtitle() ) ) {
    				carts.get(i).setCups( carts.get(i).getCups() + 1  ) ;
    				carts.get(i).setPrice(carts.get(i).getCups() * carts.get(i).getPrice());
    				s = 1;
    				System.out.println(     carts.get(i).getCups() );	
    			}
    			
    		}
    	}
    	if( s == 0 ) { 
    		int count = 1;
    		Cart cart = new Cart(sproduct.getPnum(), sproduct.getPtitle() , count , sproduct.getPprice() * count  );
    		carts.add(cart); 	
    	} ; 

    		// ???? ????????
        	loadpage2( "table" ); 	
    	
    }

    @FXML
    void btn_2(ActionEvent event) {
    	
    	// ?????? ???? ???? ???? ????
     	Product sproduct = new Product();
    	
    	
    	for( Product product : products ) {
        	
			if( product.getPnum() ==  Integer.parseInt( btn_2.getText() ) ) {
				sproduct = product;
			}
    	}
  	
    	int s = 0 ;
    	
    	if(  sproduct.getPnum() == Integer.parseInt( btn_2.getText( ))  ) {
    		
    		for(  int i = 0 ; i<carts.size() ; i++  ) {
    			
    			if( carts.get(i).getTitle().equals(sproduct.getPtitle() ) ) {
    				carts.get(i).setCups( carts.get(i).getCups() + 1  ) ;
    				carts.get(i).setPrice(carts.get(i).getCups() * carts.get(i).getPrice());
    				s = 1;
    				System.out.println(     carts.get(i).getCups() );	
    			}
    			
    		}
    	}
    	if( s == 0 ) { 
    		int count = 1;
    		Cart cart = new Cart(sproduct.getPnum(), sproduct.getPtitle() , count , sproduct.getPprice() * count  );
    		carts.add(cart); 	
    	} ; 

    		// ???? ????????
        	loadpage2( "table" );
    	
    }

    @FXML
    void btn_3(ActionEvent event) {

    	// ?????? ???? ???? ???? ????
     	Product sproduct = new Product();
    	
    	
    	for( Product product : products ) {
        	
			if( product.getPnum() ==  Integer.parseInt( btn_3.getText() ) ) {
				sproduct = product;
			}
    	}
  	
    	int s = 0 ;
    	
    	if(  sproduct.getPnum() == Integer.parseInt( btn_3.getText( ))  ) {
    		
    		for(  int i = 0 ; i<carts.size() ; i++  ) {
    			
    			if( carts.get(i).getTitle().equals(sproduct.getPtitle() ) ) {
    				carts.get(i).setCups( carts.get(i).getCups() + 1  ) ;
    				carts.get(i).setPrice(carts.get(i).getCups() * carts.get(i).getPrice());
    				s = 1;
    				System.out.println( carts.get(i).getCups() );	
    			}
    			
    		}
    	}
    	if( s == 0 ) { 
    		int count = 1;
    		Cart cart = new Cart(sproduct.getPnum(), sproduct.getPtitle() , count , sproduct.getPprice() * count  );
    		carts.add(cart); 	
    	} ; 

    		// ???? ????????
        	loadpage2( "table" );
    }
    
    @FXML
    void btn_4(ActionEvent event) {

    	// ?????? ???? ???? ???? ????
     	Product sproduct = new Product();
    	
    	
    	for( Product product : products ) {
        	
			if( product.getPnum() ==  Integer.parseInt( btn_4.getText() ) ) {
				sproduct = product;
			}
    	}
  	
    	int s = 0 ;
    	
    	if(  sproduct.getPnum() == Integer.parseInt( btn_4.getText( ))  ) {
    		
    		for(  int i = 0 ; i<carts.size() ; i++  ) {
    			
    			if( carts.get(i).getTitle().equals(sproduct.getPtitle() ) ) {
    				carts.get(i).setCups( carts.get(i).getCups() + 1  ) ;
    				carts.get(i).setPrice(carts.get(i).getCups() * carts.get(i).getPrice());
    				s = 1;
    				System.out.println( carts.get(i).getCups() );	
    			}
    			
    		}
    	}
    	if( s == 0 ) { 
    		int count = 1;
    		Cart cart = new Cart(sproduct.getPnum(), sproduct.getPtitle() , count , sproduct.getPprice() * count  );
    		carts.add(cart); 	
    	} ; 

    		// ???? ????????
        	loadpage2( "table" );
    }

    @FXML
    void btn_5(ActionEvent event) {

    	// ?????? ???? ???? ???? ????
     	Product sproduct = new Product();
    	
    	
    	for( Product product : products ) {
        	
			if( product.getPnum() ==  Integer.parseInt( btn_5.getText() ) ) {
				sproduct = product;
			}
    	}
  	
    	int s = 0 ;
    	
    	if(  sproduct.getPnum() == Integer.parseInt( btn_5.getText( ))  ) {
    		
    		for(  int i = 0 ; i<carts.size() ; i++  ) {
    			
    			if( carts.get(i).getTitle().equals(sproduct.getPtitle() ) ) {
    				carts.get(i).setCups( carts.get(i).getCups() + 1  ) ;
    				carts.get(i).setPrice(carts.get(i).getCups() * carts.get(i).getPrice());
    				s = 1;
    				System.out.println( carts.get(i).getCups() );	
    			}
    			
    		}
    	}
    	if( s == 0 ) { 
    		int count = 1;
    		Cart cart = new Cart(sproduct.getPnum(), sproduct.getPtitle() , count , sproduct.getPprice() * count  );
    		carts.add(cart); 	
    	} ; 

    		// ???? ????????
        	loadpage2( "table" );
    }

    @FXML
    void cancel(ActionEvent event) {
    	
    	// ???? ????
    	btncancel.getScene().getWindow().hide();

    	try {
    		Stage stage = new Stage();
    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/main.fxml"));
    		Scene scene = new Scene(parent);
    		stage.setScene(scene);
    		stage.setResizable(false);
    		stage.setTitle("MAIN PAGE");
    		stage.show();
    		
    	}catch (Exception e) {
			
		}
    	
    }

    // ???????? ???? ????
    @FXML
    void success(ActionEvent event) {
    	    	
    	carts = TableController.getinstance().getcart();
    	
    	// ???????? ???? ???? => order DB ????????
    	for(int i=0; i<carts.size(); i++) {
    		
    		int pnum = carts.get(i).getNum();
    		int oquantity = carts.get(i).getCups();
    		int oprice = carts.get(i).getPrice();
    		
//    		System.out.println(pnum);
//    		System.out.println(oquantity);
//        	System.out.println(oprice);
        	
        	//???? ????
        	Date date = new Date();
        	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
        	String odate = format.format(date);
//        	System.out.println(order.getOtime());
        	
        	Kitchen_Order order = new Kitchen_Order(pnum, 1, oquantity, oprice, odate, "???? ????");
        	
        	// ???? ???? ?????? ????
        	ArrayList<Kitchen_Order> orders = new ArrayList<>();
        	orders.add(order);
        	
        	KitchenDao kitchenDao = KitchenDao.getKitchenDao();
        	
        	int result = kitchenDao.addorder(order);
        	
        	if(result == 1) {	// ????
        		
        		// ???? ????
        		btnsuccess.getScene().getWindow().hide();
        		
        		try {
		    		Stage stage = new Stage();
		    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/success.fxml"));
		    		Scene scene = new Scene(parent);
		    		stage.setScene(scene);
		    		stage.setResizable(false);
		    		stage.setTitle("SUCCESS PAGE");
		    		stage.show();
		    		
		    	}catch (Exception e) {
					e.printStackTrace();
				}    	
        	} else {	// ????
        		
        		System.out.println("db ???? ????");
        	}
    	}
    	

    }
    
    // ?????? ???? ??????
    public void loadpage(String page) {
    	
    	try {
    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/" + page + ".fxml"));
    		
    		borderpane.setTop(parent);
    		
    	}catch (Exception e) {
    		
		}
    	
    }
    
    // ???????? ???? ??????
    public void loadpage2(String page) {
    	
    	try {
    		Parent parent = FXMLLoader.load(getClass().getResource("/FXML/" + page + ".fxml"));
    		
    		borderpane.setCenter(parent);
    		
    	}catch (Exception e) {
    		
		}
    	
    }
	    
	    
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		btn_1.setText("1");
		btn_2.setText("2");
		btn_3.setText("3");
		btn_4.setText("4");
		btn_5.setText("5");
		
		// dao ???? ????
		ProductDao productDao = ProductDao.getProductDao();
		
		// dao ?????? ????
		ArrayList<Product> products = productDao.allproduct();
		
		try {
			// ?? ?????????? ?? ????
			lbl_1.setText(" KRW : " + products.get(0).getPprice() + "??");
			
			lbl_2.setText(" KRW : " + products.get(1).getPprice() + "??");
			
			lbl_3.setText(" KRW : " + products.get(2).getPprice() + "??");
			
			lbl_4.setText(" KRW : " + products.get(3).getPprice() + "??");
			
			lbl_5.setText(" KRW : " + products.get(4).getPprice() + "??");
			
		}
		catch (Exception e) {
			
		}
	}
	
}
