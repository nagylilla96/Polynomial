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
import java.util.*;
import java.util.List;

import javax.swing.*;


public class GUI extends JFrame {

	public GUI() {
		initUI();
	}

	private void initUI() {
		setTitle("Polynomials");
		setSize(480, 320);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		List<JComponent> toPanelPol1 = new ArrayList<>();
		List<JComponent> toPanelMon1 = new ArrayList<>();
		JLabel polinom1Text = new JLabel("polinom 1: ");
		JLabel polinom1Result = new JLabel();
		JLabel monom1TextCoeff = new JLabel("monom1 coeff: ");
		JTextField coeff1 = new JTextField(5);
		JLabel monom1TextGrad = new JLabel("grad: ");
		JTextField grad1 = new JTextField(5);
		JButton add1 = new JButton("Add");
		toPanelPol1.add(polinom1Text);
		toPanelPol1.add(polinom1Result);
		toPanelMon1.add(monom1TextCoeff);
		toPanelMon1.add(coeff1);
		toPanelMon1.add(monom1TextGrad);
		toPanelMon1.add(grad1);
		toPanelMon1.add(add1);
		JLabel polinom2Text = new JLabel("polinom 2: ");
		JLabel polinom2Result = new JLabel();
		List<JComponent> toPanelPol2 = new ArrayList<>();
		toPanelPol2.add(polinom2Text);
		toPanelPol2.add(polinom2Result);
		JLabel monom2TextCoeff = new JLabel("monom2 coeff: ");
		JTextField coeff2 = new JTextField(5);
		JLabel monom2TextGrad = new JLabel("grad: ");
		JTextField grad2 = new JTextField(5);
		JButton add2 = new JButton("Add");
		List<JComponent> toPanelMon2 = new ArrayList<>();
		toPanelMon2.add(monom2TextCoeff);
		toPanelMon2.add(coeff2);
		toPanelMon2.add(monom2TextGrad);
		toPanelMon2.add(grad2);
		toPanelMon2.add(add2);
		JButton addPol = new JButton("Add");
		JButton subtractPol = new JButton("Subtract");
		JButton multiplyPol = new JButton("Multiply");
		JButton dividePol = new JButton("Divide");
		JButton diffPol1 = new JButton("Diff 1");
		JButton diffPol2 = new JButton("Diff 2");
		JButton intPol1 = new JButton("Integrate 1");
		JButton intPol2 = new JButton("Integrate 2");
		List<JComponent> toPanelButtons = new ArrayList<>();
		toPanelButtons.add(addPol);
		toPanelButtons.add(subtractPol);
		toPanelButtons.add(multiplyPol);
		toPanelButtons.add(dividePol);
		toPanelButtons.add(diffPol1);
		toPanelButtons.add(diffPol2);
		toPanelButtons.add(intPol1);
		toPanelButtons.add(intPol2);
		JLabel resultText = new JLabel("result: ");
		JLabel result = new JLabel();
		JLabel restText = new JLabel("rest: ");
		JLabel rest = new JLabel();
		List<JComponent> toPanelResult = new ArrayList<>();
		toPanelResult.add(resultText);
		toPanelResult.add(result);
		toPanelResult.add(restText);
		toPanelResult.add(rest);
		JButton reset = new JButton("Reset");
		List<JComponent> toPanelReset = new ArrayList<>();
		toPanelReset.add(reset);
		List<List<JComponent>> listOfComponents = new ArrayList<>();
		listOfComponents.add(toPanelPol1);
		listOfComponents.add(toPanelMon1);
		listOfComponents.add(toPanelPol2);
		listOfComponents.add(toPanelMon2);
		listOfComponents.add(toPanelButtons);
		listOfComponents.add(toPanelResult);
		listOfComponents.add(toPanelReset);
		
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
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == subtractPol) {
					Polinom polinomRes = new Polinom();
					System.out.println("SubtractPol clicked");
					polinomRes = polinom1.subtractPolinom(polinom2);			
					result.setText(polinomRes.printPolinom(polinomRes));
					subtractPol.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == multiplyPol) {
					Polinom polinomRes = new Polinom();
					System.out.println("MultiplyPol clicked");
					polinomRes = polinom1.multiplyPolinom(polinom2);			
					result.setText(polinomRes.printPolinom(polinomRes));
					multiplyPol.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
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
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == diffPol1) {
					Polinom polinomRes = new Polinom();
					System.out.println("DiffPol1 clicked");
					polinomRes = polinom1.differentiatePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					diffPol1.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == diffPol2) {
					Polinom polinomRes = new Polinom();
					System.out.println("DiffPol2 clicked");
					polinomRes = polinom2.differentiatePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					diffPol2.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == intPol1) {
					Polinom polinomRes = new Polinom();
					System.out.println("IntPol1 clicked");
					polinomRes = polinom1.integratePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					intPol1.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
				}
				if (e.getSource() == intPol2) {
					Polinom polinomRes = new Polinom();
					System.out.println("IntPol2 clicked");
					polinomRes = polinom2.integratePolinom();			
					result.setText(polinomRes.printPolinom(polinomRes));
					intPol2.setBackground(Color.cyan);
					for (JComponent i : toPanelButtons) {
						i.setEnabled(false);
					}
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
					rest.setText(null);
					resultText.setText("result: ");
					for (JComponent i : toPanelButtons) {
						i.setEnabled(true);
						i.setBackground(null);
					}
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
		createLayout(listOfComponents);
		
	}

	private void createLayout(List<List<JComponent>> listOfComponents) {
		JPanel panelMain = 	(JPanel) getContentPane();
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
		List<JPanel> panels = new ArrayList<>();
		panelReset.setLayout(new FlowLayout());
		panels.add(panelPol1);
		panels.add(panelMon1);
		panels.add(panelPol2);
		panels.add(panelMon2);
		panels.add(panelButtons);
		panels.add(panelResult);
		panels.add(panelReset);
		for (JPanel p: panels) {
			panelMain.add(p);
		}
		int it = 0;
		for (List<JComponent> i : listOfComponents) {
			for (JComponent j: i) {
				panels.get(it).add(j);
			}
			it++;
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			GUI gui = new GUI();
			gui.setVisible(true);
			JPanel panelMain = new JPanel();
			panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
			gui.setContentPane(panelMain);
			gui.setVisible(true);
		});
	}
}
