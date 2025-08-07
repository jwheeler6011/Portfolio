//
//  ContentView.swift
//  L1 Demo
//
//  Created by John Wheeler on 8/7/25.
//

import SwiftUI
import SwiftData

struct ContentView: View {
    @Environment(\.modelContext) private var modelContext
    @Query private var items: [Item]

    var body: some View {
        
        ZStack {
            
            Color(red: 0, green: 0, blue: 0)
                .ignoresSafeArea()
            Image("niagarafalls").resizable().cornerRadius(10)
                .aspectRatio(contentMode: .fit).padding(/*@START_MENU_TOKEN@*/.all/*@END_MENU_TOKEN@*/)
            Text("Niagara Falls")
                .font(.largeTitle)
                .fontWeight(.bold)        }
        .foregroundColor(.blue)

        VStack {
            
          
            

        }
       
    }

    private func addItem() {
        withAnimation {
            let newItem = Item(timestamp: Date())
            modelContext.insert(newItem)
        }
    }

    private func deleteItems(offsets: IndexSet) {
        withAnimation {
            for index in offsets {
                modelContext.delete(items[index])
            }
        }
    }
}

#Preview {
    ContentView()
}
