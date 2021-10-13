---
title: "teamworkSoftwareUpdateHealth resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkSoftwareUpdateHealth resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminAgent|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|
|companyPortal|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|
|firmware|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|
|operatingSystem|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|
|partnerAgent|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|
|teamsClient|[teamworkSoftwareUpdateStatus](../resources/teamworksoftwareupdatestatus.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkSoftwareUpdateHealth"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkSoftwareUpdateHealth",
  "adminAgent": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  },
  "companyPortal": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  },
  "teamsClient": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  },
  "firmware": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  },
  "partnerAgent": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  },
  "operatingSystem": {
    "@odata.type": "microsoft.graph.teamworkSoftwareUpdateStatus"
  }
}
```

