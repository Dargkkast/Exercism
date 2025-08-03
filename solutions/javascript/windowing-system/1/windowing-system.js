// @ts-check

/**
 * Implement the classes etc. that are needed to solve the
 * exercise in this file. Do not forget to export the entities
 * you defined so they are available for the tests.
 */

export class Size {
  constructor(width = 80, height = 60) {
    this.width = width
    this.height = height
  }

  resize(width, height) {
    this.width = width
    this.height = height
  }
}

export class Position {
  constructor(x = 0, y = 0) {
    this.x = x
    this.y = y
  }

  move(x, y) {
    this.x = x
    this.y = y
  }
}

export class ProgramWindow {
  constructor() {
    this.screenSize = new Size(800,600)
    this.size = new Size()
    this.position = new Position()
  }

  move(position) {
    if (position.x > this.screenSize.width - this.size.width) {
      position.x = this.screenSize.width - this.size.width
    }
    if (position.y > this.screenSize.height - this.size.height) {
      position.y = this.screenSize.height - this.size.height
    }
    if (position.x < 0) {
      position.x = 0
    }
    if (position.y < 0) {
      position.y = 0
    }

    
    this.position.move(position.x, position.y);
  }

  resize(size) {
    if (size.width > 300) {
      size.width = 300;
    }
    if (size.height > 200) {
      size.height = 200;
    }
    
    if (this.position.x + size.width > this.screenSize.width) {
      size.width = this.screenSize.width - this.position.x;
    }
    if (this.position.y + size.height > this.screenSize.height) {
      size.height = this.screenSize.height - this.position.y;
    }
    
    if (size.width < 1) {
      size.width = 1;
    }
    if (size.height < 1) {
      size.height = 1;
    }
    
    this.size.resize(size.width, size.height);
  }
}

export function changeWindow(programWindow) {
  programWindow.screenSize.width = 400
  programWindow.screenSize.height = 300
  
  programWindow.size.width = 400
  programWindow.size.height = 300
  
  programWindow.position.x = 100
  programWindow.position.y = 150
  
  return programWindow
}
