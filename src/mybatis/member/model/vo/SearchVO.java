package mybatis.member.model.vo;

public class SearchVO {

	private String searchSelect, searchVal;

	public SearchVO() {
	}

	public SearchVO(String searchSelect, String searchVal) {
		super();
		this.searchSelect = searchSelect;
		this.searchVal = searchVal;
	}

	@Override
	public String toString() {
		return "SearchVO [searchSelect=" + searchSelect + ", searchVal=" + searchVal + "]";
	}

	public String getSearchSelect() {
		return searchSelect;
	}

	public void setSearchSelect(String searchSelect) {
		this.searchSelect = searchSelect;
	}

	public String getSearchVal() {
		return searchVal;
	}

	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}

}
