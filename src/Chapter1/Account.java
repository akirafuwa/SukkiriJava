package Chapter1;

public class Account {
	String accountNo; //口座番号（先頭に空白が入ることもある）
	
	public boolean equals(Object o) {
		// 自分自身が引数
		if (o == this) return true;
		// nullが引数
		if (o == null) return false;
		// 型が異なる
		if (!(o instanceof Account)) return false;
		Account r = (Account)o;
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
