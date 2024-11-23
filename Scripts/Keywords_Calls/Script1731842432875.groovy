import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import loginCase.Login_Test_Case as Login_Test_Case
import teacherNavigation.Teacher_Navigate as Teacher_Navigate
import teacherNoSearchResults.Teacher_No_Search_Results as Teacher_No_Search_Results
import addTeacherToFav.Add_Teacher_To_Fav as Add_Teacher_To_Fav 
import unsaveFavTeacher.Unsave_Fav_Teacher as Unsave_Fav_Teacher
import filterTeachers.Filter_Teacher as Filter_Teacher
import navigateTeacherProfile.Navigate_Teacher_Profile as Navigate_Teacher_Profile
import saveFileTeacherProfile.Save_File_Teacher_Profile as Save_File_Teacher_Profile
import unsaveFavFile.Unsave_Fav_File as Unsave_Fav_File
import followTeacherFromProfile.Follow_Teacher_From_Profile as Follow_Teacher_From_Profile
import unfollowTeacherFromProfile.Unfollow_Teacher_From_Profile as Unfollow_Teacher_From_Profile
import shareTeacherProfileLink.Share_Teacher_Profile_Link as Share_Teacher_Profile_Link
import addTeacherToFavFromProfile.Add_Teacher_To_Fav_Form_Profile as Add_Teacher_To_Fav_Form_Profile
import unFavTeacherFromProfile.Unfav_Teacher_From_Profile as Unfav_Teacher_From_Profile
import goToTeacherProfile.Go_To_Teacher_Profile as Go_To_Teacher_Profile


// Create an instance of the class
Login_Test_Case loginFeatureTC = new Login_Test_Case()
Teacher_Navigate teachersListTC = new Teacher_Navigate()
Teacher_No_Search_Results teacherNoResultsTC = new Teacher_No_Search_Results()
Add_Teacher_To_Fav addTeacherToFavTC = new Add_Teacher_To_Fav()
Unsave_Fav_Teacher unsaveFavTeacherTC = new Unsave_Fav_Teacher()
Filter_Teacher filterTeacherTC = new Filter_Teacher()
Navigate_Teacher_Profile navTeacherProfileTC = new Navigate_Teacher_Profile()
Save_File_Teacher_Profile saveFileFromTeacherProfileTC = new Save_File_Teacher_Profile()
Unsave_Fav_File unsaveFavFileTC = new Unsave_Fav_File()
Follow_Teacher_From_Profile followTeacherFromProfileTC = new Follow_Teacher_From_Profile()
Unfollow_Teacher_From_Profile unfollowTeacherFromProfileTC = new Unfollow_Teacher_From_Profile()
Share_Teacher_Profile_Link shareTeacherProfileLinkTC = new Share_Teacher_Profile_Link()
Add_Teacher_To_Fav_Form_Profile addTeacherToFavFromProfileTC = new Add_Teacher_To_Fav_Form_Profile()
Unfav_Teacher_From_Profile unfavTeacherFromProfileTC = new Unfav_Teacher_From_Profile()
Go_To_Teacher_Profile goToTeacherProfileTC = new Go_To_Teacher_Profile()


// Login Test Case
loginFeatureTC.login('962796141803@joacademy.com', 'aeHFOx8jV/A=')

// Success msg after login Test Case
WebUI.comment("Logged in successfully.")

//----------

//Navigate to Teachers Lsit Test Case
teachersListTC.teacherNav()


// Success msg Navigation Test Case
WebUI.comment("Navigated to Teachers successfully.")

//----------

//No Search Results for Teachers Case
teacherNoResultsTC.teacherNoResults()

// Success msg for no search results Test Case
WebUI.comment("No Teachers Found successfully.")


//----------

//Save Teacher Test Case
addTeacherToFavTC.favTeacher()

// Success msg for adding Teacher to Fav Test Case
WebUI.comment("Teacher is added to Fav successfully.")


//----------

//unsave Teacher Test Case
unsaveFavTeacherTC.unSaveFavTeacher()

// Success msg for adding Teacher to Fav Test Case
WebUI.comment("Teacher is Unsaved successfully.")


//----------

//Filter Teacher Test Case
filterTeacherTC.filterTeacher() 

// Success msg for Filtering Teacher Test Case
WebUI.comment("Teacher is Unsaved successfully.")


//----------

//Navigate Teacher's Profile Test Case
navTeacherProfileTC.teacherProfile()

// Success msg for Navigating Teacher Profile Test Case
WebUI.comment("Teacher's Profile Navigation is done successfully.")


//----------

//Save File From Teacher's Profile Test Case
saveFileFromTeacherProfileTC.saveFileFromTeacherProfile()

// Success msg for Saving File from Teacher Profile Test Case
WebUI.comment("Saving File from Teacher Profile is done successfully.")


//----------

//Unsave File From Teacher's Profile Test Case
unsaveFavFileTC.unSaveFavFile()

// Success msg for Usaving File from Teacher Profile Test Case
WebUI.comment("Unsaving File from Teacher Profile is done successfully.")

//----------

//Go to Teacher's Profile Test Case
goToTeacherProfileTC.goToTeacher()

// Success msg for Navigating Teacher Profile Test Case
WebUI.comment("Teacher's Profile Navigation is done successfully for the Actions.")

//----------


//Follow Teacher From Teacher's Profile Test Case
followTeacherFromProfileTC.followTeacher()

// Success msg for Following from Teacher Profile Test Case
WebUI.comment("Teacher Follow from Teacher Profile is done successfully.")

//----------

//UnFollow Teacher From Teacher's Profile Test Case
unfollowTeacherFromProfileTC.unfollowTeacher()


// Success msg for unfollowing teacher from Teacher Profile Test Case
WebUI.comment("Teacher Unfollow from Teacher Profile is done successfully.")

//----------

//Share Teacher From Teacher's Profile Test Case
shareTeacherProfileLinkTC.shareTeacherProfile()

// Success msg for Sharing teacher link from Teacher Profile Test Case
WebUI.comment("Teacher Share Link from Teacher Profile is done successfully.")


//----------

//Add Teacher to Fav From Teacher's Profile Test Case
addTeacherToFavFromProfileTC.addTeacherToFavProfile()

// Success msg for Adding teacher to Fav from Teacher Profile Test Case
WebUI.comment("Adding Teacher to Fav from Teacher Profile is done successfully.")


//----------

//Remove Fav Teacher From Teacher's Profile Test Case
unfavTeacherFromProfileTC.unFavTeacherProfile()

// Success msg for Unfav teacher from Teacher Profile Test Case
WebUI.comment("Teacher Unfav from Teacher Profile is done successfully.")

//----------

// Close the browser
WebUI.closeBrowser()