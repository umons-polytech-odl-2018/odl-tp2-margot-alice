package exercise2;


public class ProductionWorker implements Payable {
	private int producedPieceRate;
	private int retribution=0;
	public ProductionWorker(int producedPieceRate){
		this.producedPieceRate=producedPieceRate;
	}
	public void produceOnePiece() {
		retribution++;
	}








	public int computeSalary() {

		return retribution*producedPieceRate;
	}
}

