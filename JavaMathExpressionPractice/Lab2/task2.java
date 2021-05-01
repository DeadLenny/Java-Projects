package Lab2;

import javax.swing.JOptionPane;

public class task2 {

	public static void main(String[] args) {
		
		String numShares=JOptionPane.showInputDialog("Number of shares bought and sold?");
		int numShares1=Integer.parseInt(numShares);
		String purchasePrice=JOptionPane.showInputDialog("Purchase price per share?");
		double purchasePrice1=Double.parseDouble(purchasePrice);
		String purchaseComission=JOptionPane.showInputDialog("Purchase Comission?");
		double purchaseComission1=Double.parseDouble(purchaseComission);
		String salePrice=JOptionPane.showInputDialog("Sale price per share?");
		double salePrice1=Double.parseDouble(salePrice);
		String saleComission=JOptionPane.showInputDialog("Sale Commission?");
		double saleComission1=Double.parseDouble(saleComission);
		
		double sharePrice=((numShares1 *purchasePrice1)-(numShares1 *salePrice1));
		double commissionTotal = (numShares1 * purchasePrice1 * purchaseComission1 )+ (numShares1 * salePrice1 * saleComission1 );
		
		
		double netLoss= commissionTotal+sharePrice;
if(netLoss < 0) {
		System.out.print("The net loss is: "+ netLoss);
		}
else {
	System.out.print("The net gain is: "+ netLoss);
}

		
		
	}

}
