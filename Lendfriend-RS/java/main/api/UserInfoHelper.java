package api;

import java.util.List;
import java.util.logging.Logger;

import jdbp.Jdbp;
import jdbp.exception.JdbpException;
import jdbp.model.DBInfo;
import jdbp.schema.JdbpSchema;
import rest.info.UserDBInfo;
import rest.info.UserInfo;

public class UserInfoHelper {

	public static UserInfo getFriendlyUserInfo(String requestedUser) {
		Jdbp instance = Jdbp.getInstance();
		JdbpSchema usersSchema;
		UserInfo userInfo = null;
		try {
			usersSchema = instance.getDatabase("lendfriend_users");
			List<DBInfo> userDBInfos = usersSchema.executeQuery("select * from users where display_name like " + requestedUser + ";", UserDBInfo.class);
			if (userDBInfos != null && !userDBInfos.isEmpty()) {
				userInfo = convertDBInfoToInfo((UserDBInfo) userDBInfos.get(0));
			}
		} catch (JdbpException e) {
			Logger.getLogger("Lendfriend-RS.error").log(java.util.logging.Level.SEVERE, "class=UserInfoHelper,method=getFriendlyUserInfo", e);
		}
		return userInfo;
		
	}
	
	private static UserInfo convertDBInfoToInfo(UserDBInfo userDBInfo) {
		UserInfo userInfo = new UserInfo();
		userInfo.setAccountCreation(userDBInfo.getAccountCreation());
		userInfo.setDisplayName(userDBInfo.getDisplayName());
		return userInfo;
	}
}
