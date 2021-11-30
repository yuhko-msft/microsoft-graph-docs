---
title: "cloudPcOrganizationSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcOrganizationSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcOrganizationSettings](../api/cloudpcorganizationsettings-list.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) collection|Get a list of the [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) objects and their properties.|
|[Create cloudPcOrganizationSettings](../api/virtualendpoint-post-organizationsettings.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md)|Create a new [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.|
|[Get cloudPcOrganizationSettings](../api/cloudpcorganizationsettings-get.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md)|Read the properties and relationships of a [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.|
|[Update cloudPcOrganizationSettings](../api/cloudpcorganizationsettings-update.md)|[cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md)|Update the properties of a [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.|
|[Delete cloudPcOrganizationSettings](../api/cloudpcorganizationsettings-delete.md)|None|Deletes a [cloudPcOrganizationSettings](../resources/cloudpcorganizationsettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|osVersion|cloudPcOperatingSystem|**TODO: Add Description**. The possible values are: `windows10`, `windows11`, `unknownFutureValue`.|
|userAccountType|cloudPcUserAccountType|**TODO: Add Description**. The possible values are: `standardUser`, `administrator`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcOrganizationSettings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcOrganizationSettings",
  "id": "String (identifier)",
  "userAccountType": "String",
  "osVersion": "String"
}
```

