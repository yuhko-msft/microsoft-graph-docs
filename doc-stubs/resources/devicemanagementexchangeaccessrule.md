---
title: "deviceManagementExchangeAccessRule resource type"
description: "Device Access Rules in Exchange."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementExchangeAccessRule resource type

Namespace: microsoft.graph



Device Access Rules in Exchange.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessLevel|deviceManagementExchangeAccessLevel|Access Level for Exchange granted by this rule. Possible values are: `none`, `allow`, `block`, `quarantine`.|
|deviceClass|[deviceManagementExchangeDeviceClass](../resources/devicemanagementexchangedeviceclass.md)|Device Class which will be impacted by this rule.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementExchangeAccessRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementExchangeAccessRule",
  "accessLevel": "String",
  "deviceClass": {
    "@odata.type": "microsoft.graph.deviceManagementExchangeDeviceClass"
  }
}
```

