---
title: "onPremisesPublishingSingleSignOn resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onPremisesPublishingSingleSignOn resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|kerberosSignOnSettings|[kerberosSignOnSettings](../resources/kerberossignonsettings.md)|**TODO: Add Description**|
|singleSignOnMode|singleSignOnMode|**TODO: Add Description**. Possible values are: `none`, `onPremisesKerberos`, `saml`, `pingHeaderBased`, `aadHeaderBased`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.onPremisesPublishingSingleSignOn"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onPremisesPublishingSingleSignOn",
  "kerberosSignOnSettings": {
    "@odata.type": "microsoft.graph.kerberosSignOnSettings"
  },
  "singleSignOnMode": "String"
}
```

