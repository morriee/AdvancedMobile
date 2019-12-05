import React, { Component } from 'react';
import { FlatList, StyleSheet, Text, View, ScrollView, Image } from 'react-native';


export default class FlatListBasics extends Component {
  render() {
    return (
      <View style={styles.container}>
        
        <FlatList
        // flatlist에 키값으로 셔츠의 이름과 uri를 넣음.
          data={[
            
            {key: '체크무늬셔츠',uri:"https://user-images.githubusercontent.com/42960479/70226289-ed794300-1793-11ea-9b50-9fd98f77cb9b.png"},
            {key: '하얀셔츠',uri: "https://user-images.githubusercontent.com/42960479/70227211-8d839c00-1795-11ea-8e34-7236e371a232.png"},
            {key: '꽃무늬원피스',uri: "https://user-images.githubusercontent.com/42960479/70227213-8f4d5f80-1795-11ea-846f-7549de7678f6.png"},
            {key: '빨간색원피스',uri: "https://user-images.githubusercontent.com/42960479/70227217-907e8c80-1795-11ea-9237-4a174d60a565.png"},
            {key: '빨간체크면바지',uri: "https://user-images.githubusercontent.com/42960479/70227225-91afb980-1795-11ea-94a0-07a49c2d907c.png", width: 64, height: 64},
            {key: '꽃무늬 블라우스',uri: "https://user-images.githubusercontent.com/42960479/70227238-95dbd700-1795-11ea-96a1-5b368d96652f.png", width: 64, height: 64},
            {key: '하늘하늘 블라우스',uri: "https://user-images.githubusercontent.com/42960479/70227242-970d0400-1795-11ea-8a4c-0c3aca178958.png"},
  

          ]}
            
            //View에 보이는 순서대로 이미지와 텍스트뷰를 넣음( 옷 이미지, 옷 이름, 옷 가격)
          renderItem={({item}) => <View> <Image source={{uri: item.uri, width: 64, height: 64}} /><Text style={styles.item}>{item.key}</Text><Text style={{fontSize:20}}>19,000원</Text>
                                         </View>}
        />
      </View>

    );
  }
}

const styles = StyleSheet.create({
  container: {
   flex: 1,
   paddingTop: 22 전체 컨테이너, 즉 전체 화면의 위쪽 패딩 너비
  },
  item: {
    padding: 20,    // 한 텍스트당 패딩 너비
    fontSize: 20,   // 한 텍스트당 폰트사이즈
    height: 44,       // 한 텍스트당 높이
  },    
})
