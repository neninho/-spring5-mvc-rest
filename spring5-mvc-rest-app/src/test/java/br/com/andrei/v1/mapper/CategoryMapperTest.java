package br.com.andrei.v1.mapper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.andrei.api.v1.mapper.CategoryMapper;
import br.com.andrei.model.CategoryDTO;
import br.com.andrei.domain.Category;

@SpringBootTest
public class CategoryMapperTest {

	public static final String NAME = "Joe";
	public static final long ID = 1L;

	CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

	@Test
	public void categoryToCategoryDTO() throws Exception {

		// given
		Category category = new Category();
		category.setName(NAME);
		category.setId(ID);

		// when
		CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

		// then
		assertEquals(Long.valueOf(ID), categoryDTO.getId());
		assertEquals(NAME, categoryDTO.getName());
	}

}
