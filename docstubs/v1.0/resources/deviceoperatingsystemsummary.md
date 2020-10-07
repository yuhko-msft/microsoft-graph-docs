---
title: "deviceOperatingSystemSummary resource type"
description: "Device operating system summary."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# deviceOperatingSystemSummary resource type

Namespace: microsoft.graph

Device operating system summary.

## Properties

| Property           | Type  | Description                            |
| :----------------- | :---- | :------------------------------------- |
| androidCount       | Int32 | Number of android device count.        |
| iosCount           | Int32 | Number of iOS device count.            |
| macOSCount         | Int32 | Number of Mac OS X device count.       |
| unknownCount       | Int32 | Number of unknown device count.        |
| windowsCount       | Int32 | Number of Windows device count.        |
| windowsMobileCount | Int32 | Number of Windows mobile device count. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceOperatingSystemSummary",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceOperatingSystemSummary",
  "androidCount": "Int32",
  "iosCount": "Int32",
  "macOSCount": "Int32",
  "unknownCount": "Int32",
  "windowsCount": "Int32",
  "windowsMobileCount": "Int32"
}
```