ParkingLots－ 停车场管理系统
==============
## PartII (第二期) - 停车员 2012.11.18

### 场景

车库面积扩大，有多层停车场。停车员负责停车取车并管理这些停车场。

### 需求：

作为一个停车员，我需要管理多个停车场；

以便停车的时候，我可以快速的停进有空车位的停车场；取车的时候我能取到正确的车辆。

### 前提

第一期的需求保持有效。





## Part I（第一期）有一个停车场，能够停车取车。

### 任务分解：

假定有一个停车场，并有空车位
当停一辆车
应该成功

假定有一个停车场，已停满车辆
当停一辆车
应该失败

假定有一个停车场，停了一辆车
当用正确票据取车
应该成功，取的车和停进去的是同一辆车

假定有一个停车场
当用不正确的票据取车
应该失败
