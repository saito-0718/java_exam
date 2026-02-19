package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		// findAllの結果確認
		List<Member> members = repository.findAll();
		System.out.println("findAllの結果");
		for (Member member : members) {
			System.out.print("id:" + member.getId() + ",");
			System.out.print("名前:" + member.getName() + ",");
			System.out.print("年齢:" + member.getAge() + ",");
			System.out.println("dep_id:" + member.getDepId());
		}

		// loadの結果確認
		Member member = repository.load(2);
		System.out.println("loadの結果");
		System.out.print("id:" + member.getId() + ",");
		System.out.print("名前:" + member.getName() + ",");
		System.out.print("年齢:" + member.getAge() + ",");
		System.out.println("dep_id:" + member.getDepId());

		// 登録処理
		Member saito = new Member();
		saito.setName("齋藤");
		saito.setAge(24);
		saito.setDepId(1);
		repository.save(saito);

		// 更新処理
		Member jiro = new Member();
		jiro.setId(member.getId());
		jiro.setName("シロー");
		jiro.setAge(32);
		jiro.setDepId(2);
		repository.save(jiro);

		return "member";
	}
}
