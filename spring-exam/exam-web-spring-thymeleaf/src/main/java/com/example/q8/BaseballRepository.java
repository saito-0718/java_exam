package com.example.q8;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseballRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<BaseballDomain> baseballDomainRowMapper = (rs, i) -> {
		Integer id = rs.getInt("team_id");
		String name = rs.getString("team_name");
		Date date = rs.getDate("established_date");
		StadiumDomain stadiumDomain = new StadiumDomain();
		stadiumDomain.setName(rs.getString("stadium_name"));

		return new BaseballDomain(id, name, date, stadiumDomain);
	};

	public List<BaseballDomain> findAll() {
		String sql = """
				SELECT
					t.id team_id,
					t.name team_name,
					established_date,
					s.name stadium_name
				FROM
					teams t
				JOIN
					stadiums s
				ON
					t.stadium_id=s.id
				ORDER BY
					established_date
					""";

		List<BaseballDomain> baseballDomainList = template.query(sql, baseballDomainRowMapper);

		return baseballDomainList;
	}

	public BaseballDomain load(Integer id) {
		// 未実装
		return null;
	}

	public BaseballDomain save(BaseballDomain baseballDomain) {
		// 未実装
		return null;
	}

	public BaseballDomain delete(Integer id) {
		// 未実装
		return null;
	}
}
