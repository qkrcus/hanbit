package lotto;

public interface LottoService {
	public void setLottos(LottoBean bean);

	public int[][] getLottos();

	public int generateRandomNum();

	public boolean isDuplication(int count, int num);

	public void sort(int[] arr);

	public int count(LottoBean bean);
}
