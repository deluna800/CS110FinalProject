import java.util.Random;
import java.awt.event.*;
/**
* Nicholas DeLuna
* CS 110
* GUI WAR CARD GAME
* 
**/
import java.awt.GridLayout;
import javax.swing.*;

public class WarCard extends JFrame implements ActionListener
{
	private JLabel player1Deck, player2Deck, player1Turned, player2Turned;
	private JButton btnNext, btnNew, btnExit;
	private Game game;
	SpringLayout layout;

	public WarCard()
   {
		buildGui();
		
		Random r = new Random();
		game = new Game("Player 1", "Computer", r.nextLong());
	}

	/**
	 * Builds the user interface using the spring layout manager
    * Used Java tutorials to help with springLayout
    * http://docs.oracle.com/javase/tutorial/uiswing/layout/spring.html
	 */
	private void buildGui()
   {
		layout = new SpringLayout();
		this.setLayout(layout);

		// player 1 panel to house playing deck and turned deck
		JPanel panelPlayer1 = new JPanel();
		panelPlayer1.setBorder(BorderFactory.createTitledBorder("Player 1"));
		layout.putConstraint(SpringLayout.NORTH, panelPlayer1, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panelPlayer1, 10, SpringLayout.WEST, this);

		// player1 playing deck
		player1Deck = new JLabel();
		player1Deck.setIcon(new ImageIcon("Pictures/back.jpg"));
		layout.putConstraint(SpringLayout.NORTH, player1Deck, 10, SpringLayout.NORTH, panelPlayer1);
		layout.putConstraint(SpringLayout.WEST, player1Deck, 10, SpringLayout.WEST, panelPlayer1);
		panelPlayer1.add(player1Deck);

		// player1 turned deck
		player1Turned = new JLabel();
		// added spaces to label as a place holder for width of deck on startup
		player1Turned.setText("                           ");
		layout.putConstraint(SpringLayout.NORTH, player1Turned, 10, SpringLayout.NORTH, panelPlayer1);
		layout.putConstraint(SpringLayout.WEST, player1Turned, 10, SpringLayout.EAST, player1Deck);
		panelPlayer1.add(player1Turned);

		// panel to hold the nextTurn button
		JPanel panelButton = new JPanel();
		layout.putConstraint(SpringLayout.NORTH, panelButton, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panelButton, 10, SpringLayout.EAST, panelPlayer1);

		// create new JButton to turn the cards
		btnNext = new JButton("Next Card");
		// add listener
		btnNext.addActionListener(this);
		layout.putConstraint(SpringLayout.NORTH, btnNext, 30, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, btnNext, 10, SpringLayout.EAST, player1Turned);
		panelButton.add(btnNext);

		// computer panel to hold playing deck and turned deck
		JPanel panelPlayer2 = new JPanel();
		panelPlayer2.setBorder(BorderFactory.createTitledBorder("Computer"));
		layout.putConstraint(SpringLayout.NORTH, panelPlayer2, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, panelPlayer2, 10, SpringLayout.EAST, panelButton);

		// computer playing deck
		player2Deck = new JLabel();
		player2Deck.setIcon(new ImageIcon("Pictures/back.jpg"));
		layout.putConstraint(SpringLayout.NORTH, player2Deck, 10, SpringLayout.NORTH, panelPlayer2);
		layout.putConstraint(SpringLayout.WEST, player2Deck, 10, SpringLayout.WEST, panelPlayer2);
		panelPlayer2.add(player2Deck);

		// computer turned deck
		player2Turned = new JLabel();
		// spaces added to label to hold spacing for turned deck on startup
		player2Turned.setText("                           ");
		layout.putConstraint(SpringLayout.NORTH, player2Turned, 10, SpringLayout.NORTH, panelPlayer2);
		layout.putConstraint(SpringLayout.WEST, player2Turned, 10, SpringLayout.EAST, player2Deck);
		panelPlayer2.add(player2Turned);

		      
			
		btnNew = new JButton("New Game");
		btnNew.addActionListener(this);
		layout.putConstraint(SpringLayout.NORTH, btnNew, 20, SpringLayout.SOUTH, panelPlayer2);
		

		btnExit = new JButton("      Exit       ");
		btnExit.addActionListener(this);
		layout.putConstraint(SpringLayout.NORTH, btnExit, 10, SpringLayout.SOUTH, btnNew);
		


		this.add(panelPlayer1);
		this.add(panelPlayer2);
		this.add(panelButton);
		this.add(btnNew);
		this.add(btnExit);
		this.setTitle("WarCard");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(850, 400);
		this.setVisible(true);
	}

	// start new game
	public static void main(String[] args)
   {
		new WarCard();
	}

	//@Override
	public void actionPerformed(ActionEvent e) 
   {
		// source is the exit button
		if(e.getSource().equals(btnExit))
      {
			System.exit(0);
		// source is the new button, start new game and close old screen
		}else if(e.getSource().equals(btnNew))
      {
			this.setVisible(false);
			new WarCard();
		// deal next card
		}
      else if(e.getSource().equals(btnNext))
      {
			// make sure game is not over 
			if(!game.gameComplete())
         {
				game.nextCard();
				boolean isWar = game.getIsWar();
				Card player1Card = game.getPlayer1Card();
				// remove spacing from label and set correct background image
				player1Turned.setText("");
				player1Turned.setIcon(player1Card.getCardImage(isWar));
				Card player2Card = game.getPlayer2Card();
				player2Turned.setText("");
				player2Turned.setIcon(player2Card.getCardImage(isWar));
				
			}	
		}
	}
}
