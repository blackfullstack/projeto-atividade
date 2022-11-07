import {createAppContainer,createStackNavigator} from 'rect-navigation'
i
const AppNavigator = createStackNavigator({
 'Login':{
    Screen: loginScreen,
    navigationOptions:{
        title:'Bem vindo!'

    }
 }
   }  

       
,{
    
    defaultNavigationOptions:{
        title: "Series!",
        headerTintColor:'white',
        headerStyle:{
            backgroundColor:'blue'
            
        },

        headerTitleStyle: {
            color:'white',
            fontSize:30,
        }


    }


});

    

const AppContainer = createAppContainer (AppNavigator);

    export default AppContainer;