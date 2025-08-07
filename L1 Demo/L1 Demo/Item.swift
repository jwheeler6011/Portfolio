//
//  Item.swift
//  L1 Demo
//
//  Created by John Wheeler on 8/7/25.
//

import Foundation
import SwiftData

@Model
final class Item {
    var timestamp: Date
    
    init(timestamp: Date) {
        self.timestamp = timestamp
    }
}
