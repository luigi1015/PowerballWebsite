package com.codehobby.powerball;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PowerballWebsiteController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PowerballWebsiteController.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public String root( Model model )
	{
		List<Map<String, Object>> whiteballInfo = null;
		try
		{
			whiteballInfo = jdbcTemplate.queryForList("CALL GetWhiteBallCounts();");
		} catch( DataAccessException dae ) {
			model.addAttribute( "errorMessage", "Error getting Powerball data." );
			LOGGER.error( "Error getting Powerball data: {}", dae.getMessage(), dae );
		}

		model.addAttribute( "numbers", whiteballInfo );
		return "root";
	}
}
