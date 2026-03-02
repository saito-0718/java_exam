package com.example.q7;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CalcForm {

	@NotBlank(message = "左のテキストボックスには数字を入力してください")
	// @Pattern(regexp = "$1-$9", message = "左のテキストボックスには数字を入力してください")
	private String left;

	@NotBlank(message = "右のテキストボックスには数字を入力してください")
	// @Pattern(regexp = "$1-$9", message = "右のテキストボックスには数字を入力してください")
	private String right;

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}
}
