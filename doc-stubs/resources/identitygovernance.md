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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get identityGovernance](../api/identitygovernance-get.md)|[identityGovernance](../resources/identitygovernance.md)|Read the properties and relationships of an [identityGovernance](../resources/identitygovernance.md) object.|
|[Update identityGovernance](../api/identitygovernance-update.md)|[identityGovernance](../resources/identitygovernance.md)|Update the properties of an [identityGovernance](../resources/identitygovernance.md) object.|
|[List accessReviewSet](../api/identitygovernance-list-accessreviews.md)|[accessReviewSet](../resources/accessreviewset.md) collection|Get the accessReviewSet resources from the accessReviews navigation property.|
|[Create accessReviewSet](../api/identitygovernance-post-accessreviews.md)|[accessReviewSet](../resources/accessreviewset.md)|Create a new accessReviewSet object.|
|[List appConsentApprovalRoute](../api/identitygovernance-list-appconsent.md)|[appConsentApprovalRoute](../resources/appconsentapprovalroute.md) collection|Get the appConsentApprovalRoute resources from the appConsent navigation property.|
|[Create appConsentApprovalRoute](../api/identitygovernance-post-appconsent.md)|[appConsentApprovalRoute](../resources/appconsentapprovalroute.md)|Create a new appConsentApprovalRoute object.|
|[List entitlementManagement](../api/identitygovernance-list-entitlementmanagement.md)|[entitlementManagement](../resources/entitlementmanagement.md) collection|Get the entitlementManagement resources from the entitlementManagement navigation property.|
|[Create entitlementManagement](../api/identitygovernance-post-entitlementmanagement.md)|[entitlementManagement](../resources/entitlementmanagement.md)|Create a new entitlementManagement object.|
|[List termsOfUseContainer](../api/identitygovernance-list-termsofuse.md)|[termsOfUseContainer](../resources/termsofusecontainer.md) collection|Get the termsOfUseContainer resources from the termsOfUse navigation property.|
|[Create termsOfUseContainer](../api/identitygovernance-post-termsofuse.md)|[termsOfUseContainer](../resources/termsofusecontainer.md)|Create a new termsOfUseContainer object.|

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

