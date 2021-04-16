---
title: "mobileAppTroubleshootingAppTargetHistory resource type"
description: "History Item contained in the Mobile App Troubleshooting Event."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppTroubleshootingAppTargetHistory resource type

Namespace: microsoft.graph



History Item contained in the Mobile App Troubleshooting Event.


Inherits from [mobileAppTroubleshootingHistoryItem](../resources/mobileapptroubleshootinghistoryitem.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorCode|String|Error code for the failure, empty if no failure.|
|occurrenceDateTime|DateTimeOffset|Time when the history item occurred. Inherited from [mobileAppTroubleshootingHistoryItem](../resources/mobileapptroubleshootinghistoryitem.md)|
|runState|runState|Status of the item. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|securityGroupId|String|AAD security group id to which it was targeted.|
|troubleshootingErrorDetails|[deviceManagementTroubleshootingErrorDetails](../resources/devicemanagementtroubleshootingerrordetails.md)|Object containing detailed information about the error and its remediation. Inherited from [mobileAppTroubleshootingHistoryItem](../resources/mobileapptroubleshootinghistoryitem.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mobileAppTroubleshootingAppTargetHistory"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppTroubleshootingAppTargetHistory",
  "occurrenceDateTime": "String (timestamp)",
  "troubleshootingErrorDetails": {
    "@odata.type": "microsoft.graph.deviceManagementTroubleshootingErrorDetails"
  },
  "errorCode": "String",
  "runState": "String",
  "securityGroupId": "String"
}
```

