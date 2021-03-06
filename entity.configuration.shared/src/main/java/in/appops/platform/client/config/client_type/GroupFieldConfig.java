package in.appops.platform.client.config.client_type;

import in.appops.platform.core.entity.type.MetaType;
import in.appops.platform.server.entityconfiguration_type.basic.GroupFieldConfigType;

import java.util.ArrayList;

/**
 * @author pallavi@ensarm.com
 * @createdOn 11-Nov-2013
 */

@SuppressWarnings("serial")
public class GroupFieldConfig extends BaseFieldConfig{
	
	public GroupFieldConfig() {
		setType(new MetaType(GroupFieldConfig.class));
	}
	
	public String getGroupFieldType(){
		return getPropertyByName(GroupFieldConfigType.GF_TYPE);
	}
	
	public String getGroupFieldAlignment(){
		return getPropertyByName(GroupFieldConfigType.GF_ALIGNMENT);
	}
	
	public Integer getGroupFieldLimit(){
		return getPropertyByName(GroupFieldConfigType.GF_LIMIT);
	}
	
	public ArrayList<String> getListOfItems(){
		return getPropertyByName(GroupFieldConfigType.GF_LIST_OF_ITEMS);
	}
	
	public Integer getGroupFieldId(){
		return getPropertyByName(GroupFieldConfigType.GF_ID);
	}

}
