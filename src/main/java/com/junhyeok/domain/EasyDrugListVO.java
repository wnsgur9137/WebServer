package com.junhyeok.domain;

public class EasyDrugListVO {
	private String drugSeq;
	private String drugName;
	private String efcyQesitm;
	private String useMethodQesitm;
	private String atpnWarnQesitm;
	private String atpnQesitm;
	private String intrcQesitm;
	private String seQesitm;
	private String depositMethodQesitm;
	private String openDe;
	private String updateDe;
	private String drugImage;
	
	public EasyDrugListVO() {
		super();
	}

	@Override
	public String toString() {
		return "EasyDrugListVO [drugSeq=" + drugSeq + ", drugName=" + drugName + ", efcyQesitm=" + efcyQesitm
				+ ", useMethodQesitm=" + useMethodQesitm + ", atpnWarnQesitm=" + atpnWarnQesitm + ", atpnQesitm="
				+ atpnQesitm + ", intrcQesitm=" + intrcQesitm + ", seQesitm=" + seQesitm + ", depositMethodQesitm="
				+ depositMethodQesitm + ", openDe=" + openDe + ", updateDe=" + updateDe + ", drugImage=" + drugImage
				+ "]";
	}

	public String getDrugSeq() {
		return drugSeq;
	}
	public void setDrugSeq(String drugSeq) {
		this.drugSeq = drugSeq;
	}

	public String getdrugName() {
		return drugName;
	}
	public void setdrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getEfcyQesitm() {
		return efcyQesitm;
	}
	public void setEfcyQesitm(String efcyQesitm) {
		this.efcyQesitm = efcyQesitm;
	}

	public String getUseMethodQesitm() {
		return useMethodQesitm;
	}
	public void setUseMethodQesitm(String useMethodQesitm) {
		this.useMethodQesitm = useMethodQesitm;
	}

	public String getAtpnWarnQesitm() {
		return atpnWarnQesitm;
	}
	public void setAtpnWarnQesitm(String atpnWarnQesitm) {
		this.atpnWarnQesitm = atpnWarnQesitm;
	}

	public String getAtpnQesitm() {
		return atpnQesitm;
	}
	public void setAtpnQesitm(String atpnQesitm) {
		this.atpnQesitm = atpnQesitm;
	}

	public String getIntrcQesitm() {
		return intrcQesitm;
	}
	public void setIntrcQesitm(String intrcQesitm) {
		this.intrcQesitm = intrcQesitm;
	}

	public String getSeQesitm() {
		return seQesitm;
	}
	public void setSeQesitm(String seQesitm) {
		this.seQesitm = seQesitm;
	}

	public String getDepositMethodQesitm() {
		return depositMethodQesitm;
	}
	public void setDepositMethodQesitm(String depositMethodQesitm) {
		this.depositMethodQesitm = depositMethodQesitm;
	}

	public String getOpenDe() {
		return openDe;
	}
	public void setOpenDe(String openDe) {
		this.openDe = openDe;
	}

	public String getUpdateDe() {
		return updateDe;
	}
	public void setUpdateDe(String updateDe) {
		this.updateDe = updateDe;
	}

	public String getDrugImage() {
		return drugImage;
	}
	public void setDrugImage(String drugImage) {
		this.drugImage = drugImage;
	}
	
}
