---
title: "identityGovernance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identityGovernance resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get identityGovernance](../api/identitygovernance-get.md)|[identityGovernance](../resources/identitygovernance.md)|Read the properties and relationships of an [identityGovernance](../resources/identitygovernance.md) object.|
|[Update identityGovernance](../api/identitygovernance-update.md)|[identityGovernance](../resources/identitygovernance.md)|Update the properties of an [identityGovernance](../resources/identitygovernance.md) object.|
|[List entitlementManagement](../api/identitygovernance-list-entitlementmanagement.md)|[entitlementManagement](../resources/entitlementmanagement.md) collection|Get the entitlementManagement resources from the entitlementManagement navigation property.|
|[Create entitlementManagement](../api/identitygovernance-post-entitlementmanagement.md)|[entitlementManagement](../resources/entitlementmanagement.md)|Create a new entitlementManagement object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessReviews|[accessReviewSet](../resources/accessreviewset.md)|**TODO: Add Description**|
|appConsent|[appConsentApprovalRoute](../resources/appconsentapprovalroute.md)|**TODO: Add Description**|
|entitlementManagement|[entitlementManagement](../resources/entitlementmanagement.md)|**TODO: Add Description**|
|termsOfUse|[termsOfUseContainer](../resources/termsofusecontainer.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.identityGovernance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.identityGovernance"
}
```

