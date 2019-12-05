import React, { Component } from 'react';
import { FlatList, StyleSheet, Text, View, ScrollView, Image } from 'react-native';

export default class IScrolledDownAndWhatHappenedNextShockedMe extends Component {
  render() {
      return (
        <ScrollView>
          <View style={{height: 50, backgroundColor: 'green', alignItems: 'left', justifyContent: 'center'}}>
            <Text style={{color: 'white'}}> MyShoppingMall </Text>
          </View>
          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70226289-ed794300-1793-11ea-9b50-9fd98f77cb9b.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 체크무늬셔츠 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 체크무늬 패턴의 디자인인 셔츠 </Text>
              <Text> </Text>
              <Text> 34,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>
          
          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227211-8d839c00-1795-11ea-8e34-7236e371a232.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 하얀셔츠 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 하얀색깔의 민무늬 셔츠 </Text>
              <Text> </Text>
              <Text> 26,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>

          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227213-8f4d5f80-1795-11ea-846f-7549de7678f6.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 빨간색원피스 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 빨간색상의 원피스 </Text>
              <Text> </Text>
              <Text> 57,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>

          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227217-907e8c80-1795-11ea-9237-4a174d60a565.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 빨간체크면바지 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 빨간체크무늬의 면바지 </Text>
              <Text> </Text>
              <Text> 44,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>

          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227225-91afb980-1795-11ea-94a0-07a49c2d907c.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 보라색스웨터 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 보라색상의 따뜻한 스웨터 </Text>
              <Text> </Text>
              <Text> 26,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>

          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227238-95dbd700-1795-11ea-96a1-5b368d96652f.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 분홍색 스웨터 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 분홍색상의 털털한 스웨터 </Text>
              <Text> </Text>
              <Text> 33,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>

          <View style={{height: 110, flexDirection: 'row'}}>
            <View style={{width: 110, margin: 5}}>
              <Image source={{uri: "https://user-images.githubusercontent.com/42960479/70227242-970d0400-1795-11ea-8a4c-0c3aca178958.png", width: 100, height: 100}} />
            </View>
            <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
              <Text style={{fontSize: 20}}> 왕단추가디건 </Text>
              <Text> </Text>
              <Text style={{color: 'gray'}}> 단추가 돋보이는 가디건 </Text>
              <Text> </Text>
              <Text> 42,000원 </Text>
            </View>
          </View>
          <View style={{flex: 1, backgroundColor: '#F9F9F9'}}>
            <Text style={{fontSize: 4}}> </Text>
          </View>
        </ScrollView>
    );
  }
}
