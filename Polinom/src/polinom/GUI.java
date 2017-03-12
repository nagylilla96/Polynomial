/**
 * Creates the GUI for the Polinom class
 *
 * @author Nagy Lilla
 * @version 12 Mar 2017
 */

package polinom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;


public class GUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Polynomials");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(480, 320));
		frame.setResizable(false);
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
		frame.setContentPane(panelMain);
		JPanel panelPol1 = new JPanel();
		panelPol1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panelMon1 = new JPanel();
		panelMon1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panelPol2 = new JPanel();
		panelPol2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panelMon2 = new JPanel();
		panelMon2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(2, 4));
		JPanel panelResult = new JPanel();
		panelResult.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panelReset = new JPanel();
		panelReset.setLayout(new FlowLayout());
		panelMain.add(panelPol1);
		panelMain.add(panelMon1);
		panelMain.add(panelPol2);
		panelMain.add(panelMon2);
		panelMain.add(panelButtons);
		panelMain.add(panelResult);
		panelMain.add(panelReset);
		JLabel polinom1Text = new JLabel("polinom 1: ");
		JLabel polinom1Result = new JLabel();
		panelPol1.add(polinom1Text);
		panelPol1.add(polinom1Result);
		JLabel monom1TextCoeff = new JLabel("monom1 coeff: ");
		JTextField coeff1 = new JTextField(5);
		JLabel monom1TextGrad = new JLabel("grad: ");
		JTextField grad1 = new JTextField(5);
		JButton add1 = new JButton("Add");
		panelMon1.add(monom1TextCoeff);
		panelMon1.add(coeff1);
		panelMon1.add(monom1TextGrad);
		panelMon1.add(grad1);
		panelMon1.add(add1);
		JLabel polinom2Text = new JLabel("polinom 2: ");
		JLabel polinom2Result = new JLabel();
		panelPol2.add(polinom2Text);
		panelPol2.add(polinom2Result);
		JLabel monom2TextCoeff = new JLabel("monom2 coeff: ");
		JTextField coeff2 = new JTextField(5);
		JLabel monom2TextGrad = new JLabel("grad: ");
		JTextField grad2 = new JTextField(5);
		JButton add2 = new JButton("Add");
		panelMon2.add(monom2TextCoeff);
		panelMon2.add(coeff2);
		panelMon2.add(monom2TextGrad);
		panelMon2.add(grad2);
		panelMon2.add(add2);
		JButton addPol = new JButton("Add");
		JButton subtractPol = new JButton("Subtract");
		JButton multiplyPol = new JButton("Multiply");
		JButton dividePol = new JButton("Divide");
		JButton diffPol1 = new JButton("Diff 1");
		JButton diffPol2 = new JButton("Diff 2");
		JButton intPol1 = new JButton("Integrate 1");
		JButton intPol2 = new JButton("Integrate 2");
		panelButtons.add(addPol);
		panelButtons.add(subtractPol);
		panelButtons.add(multiplyPol);
		panelButtons.add(dividePol);
		panelButtons.add(diffPol1);
		panelButtons.add(diffPol2);
		panelButtons.add(intPol1);
		panelButtons.add(intPol2);
		JLabel resultText = new JLabel("result: ");
		JLabel result = new JLabel();
		JLabel restText = new JLabel("rest: ");
		JLabel rest = new JLabel();
		panelResult.add(resultText);
		panelResult.add(result);
		panelResult.add(restText);
		panelResult.add(rest);
		JButton reset = new JButton("Reset");
		panelReset.add(reset);
		Polinom polinom1 = new Polinom();
		Polinom polinom2 = new Polinom();
		

		class Action implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == add1) {
					System.out.println("Add 1 clicked");
					Monom m = new MonomInt(Integer.parseInt(coeff1.getText()), Integer.parseInt(grad1.getText()));
					if (!polinom1.getMonoms().contains(m)) {
						polinom1.addMonom(m);
					}					
					polinom1Result.setText(polinom1.printPolinom(polinom1));
				}	
				if (e.getSource() == add2) {
					System.out.println("Add 2 clicked");
					Monom m = new MonomInt(Integer.parseInt(coeff2.getText()), Integer.parseInt(grad2.getText()));
					if (!polinom2.getMonoms().contains(m)) {
						polinom2.addMonom(m);
					}					
					polinom2Result.setText(polinom2.printPolinom(polinom2));
				}	
				if (e.getSource() == addPol) {
					Polinom polinomRes = new Polinom();
					System.out.println("AddPol clicked");
					polinomRes = polinom1.addPolinom(polinom2);			
					result.setText(polinomRes.printPolinom(polinomRes));
					addPol.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == subtractPol) {
					Polinom polinomRes = new Polinom();
					System.out.println("SubtractPol clicked");
					polinomRes = polinom1.subtractPolinom(polinom2);			
					result.setText(polinomRes.printPolinom(polinomRes));
					subtractPol.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == multiplyPol) {
					Polinom polinomRes = new Polinom();
					System.out.println("MultiplyPol clicked");
					polinomRes = polinom1.multiplyPolinom(polinom2);			
					result.setText(polinomRes.printPolinom(polinomRes));
					multiplyPol.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == dividePol) {
					Polinom polinomRes = new Polinom();
					System.out.println("DividePol clicked");
					resultText.setText("quotient: ");
					Polinom polinomRest = new Polinom();
					List<Polinom> resultList = polinom1.dividePolinom(polinom2);
					polinomRes = resultList.get(0);
					polinomRest = resultList.get(1); 
					result.setText(polinomRes.printPolinom(polinomRes));
					rest.setText(polinomRest.printPolinom(polinomRest));
					dividePol.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == diffPol1) {
					Polinom polinomRes = new Polinom();
					System.out.println("DiffPol1 clicked");
					polinomRes = polinom1.differentiatePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					diffPol1.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == diffPol2) {
					Polinom polinomRes = new Polinom();
					System.out.println("DiffPol2 clicked");
					polinomRes = polinom2.differentiatePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					diffPol2.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == intPol1) {
					Polinom polinomRes = new Polinom();
					System.out.println("IntPol1 clicked");
					polinomRes = polinom1.integratePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					intPol1.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == intPol2) {
					Polinom polinomRes = new Polinom();
					System.out.println("IntPol2 clicked");
					polinomRes = polinom2.integratePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					intPol2.setBackground(Color.cyan);
					add1.setEnabled(false);
					add2.setEnabled(false);
					addPol.setEnabled(false);
					subtractPol.setEnabled(false);
					multiplyPol.setEnabled(false);
					dividePol.setEnabled(false);
					diffPol1.setEnabled(false);
					diffPol2.setEnabled(false);
					intPol1.setEnabled(false);
					intPol2.setEnabled(false);
				}
				if (e.getSource() == reset) {
					polinom1Result.setText(null);
					polinom1.getMonoms().clear();
					polinom2.getMonoms().clear();
					coeff1.setText(null);
					grad1.setText(null);
					polinom2Result.setText(null);
					coeff2.setText(null);
					grad2.setText(null);
					result.setText(null);
					add1.setEnabled(true);
					add2.setEnabled(true);
					addPol.setEnabled(true);
					subtractPol.setEnabled(true);
					multiplyPol.setEnabled(true);
					dividePol.setEnabled(true);
					diffPol1.setEnabled(true);
					diffPol2.setEnabled(true);
					intPol1.setEnabled(true);
					intPol2.setEnabled(true);
					addPol.setBackground(null);
					subtractPol.setBackground(null);
					multiplyPol.setBackground(null);
					dividePol.setBackground(null);
					diffPol1.setBackground(null);
					diffPol2.setBackground(null);
					intPol1.setBackground(null);
					intPol2.setBackground(null);
				}
			}

		}
		Action action = new Action();
		add1.addActionListener(action);
		add2.addActionListener(action);
		addPol.addActionListener(action);
		subtractPol.addActionListener(action);
		multiplyPol.addActionListener(action);
		dividePol.addActionListener(action);
		diffPol1.addActionListener(action);
		diffPol2.addActionListener(action);
		intPol1.addActionListener(action);
		intPol2.addActionListener(action);
		reset.addActionListener(action);
		frame.setVisible(true);

	}

}