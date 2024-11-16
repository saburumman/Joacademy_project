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


