package tes.org.fugerit.java.labs.release;

import org.fugerit.java.labs.release.ReleaseModel;
import org.junit.Assert;
import org.junit.Test;

public class TestReleaseModel {

	@Test
	public void testModel() {
		ReleaseModel model = new ReleaseModel();
		model.setId( "test" );
		Assert.assertNotNull( model.getId() );
	}
	
}
