---
title: "mailboxSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailboxSettings resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|archiveFolder|String|**TODO: Add Description**|
|automaticRepliesSetting|[automaticRepliesSetting](../resources/automaticrepliessetting.md)|**TODO: Add Description**|
|dateFormat|String|**TODO: Add Description**|
|delegateMeetingMessageDeliveryOptions|delegateMeetingMessageDeliveryOptions|**TODO: Add Description**. Possible values are: `sendToDelegateAndInformationToPrincipal`, `sendToDelegateAndPrincipal`, `sendToDelegateOnly`.|
|language|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|timeFormat|String|**TODO: Add Description**|
|timeZone|String|**TODO: Add Description**|
|userPurpose|[userPurpose](../resources/userpurpose.md)|**TODO: Add Description**|
|userPurposeV2|mailboxRecipientType|**TODO: Add Description**. Possible values are: `unknown`, `user`, `linked`, `shared`, `room`, `equipment`, `others`.|
|workingHours|[workingHours](../resources/workinghours.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mailboxSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailboxSettings",
  "archiveFolder": "String",
  "automaticRepliesSetting": {
    "@odata.type": "microsoft.graph.automaticRepliesSetting"
  },
  "dateFormat": "String",
  "delegateMeetingMessageDeliveryOptions": "String",
  "language": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "timeFormat": "String",
  "timeZone": "String",
  "userPurpose": {
    "@odata.type": "microsoft.graph.userPurpose"
  },
  "userPurposeV2": "String",
  "workingHours": {
    "@odata.type": "microsoft.graph.workingHours"
  }
}
```

