---
title: "Configure the scope of your access review using the Microsoft Graph API"
description: "Learn how to use the access reviews API in Microsoft Graph to review access to Azure AD resources."
author: "isabelleatmsft"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: conceptualPageType
---

# Configure the scope of your access review using the Microsoft Graph API

The Azure AD [access reviews API](/graph/api/resources/accessreviewsv2-overview) allows you to programmatically review the access that users, service principals, or groups have to your Azure AD resources.

The resources to review are configured in the **scope** property of the access reviews [accessReviewScheduleDefinition](/graph/api/resources/accessreviewscheduledefinition) resource. This property is of the type [accessReviewScope](/graph/api/resources/accessreviewscope), an abstract type inherited by the following resources that can be used to configure resources or groups of resources that access will be reviewed against.

|Resource|Description|Example scenarios|
|:---    |:---       |:---             |
|[accessReviewQueryScope](/graph/api/resources/accessreviewqueryscope)|Best applicable when reviewing the full set or subset of principals who have access to a resource or group of related resources.|<ul><li>Membership of users assigned to a group.</li><li>Guest user access to one group.</li><li>Guest user access to all Microsoft 365 groups in a tenant.</li><li>Service principals assigned to privileged roles.</li><li>User and service principal access to Entitlement Management access packages.</li></ul>|
|[accessReviewInactiveUsersQueryScope](/graph/api/resources/accessreviewinactiveusersqueryscope)|Inherited from accessReviewQueryScope. Used when only inactive users are reviewed. Their inactive status is specified by the **inactiveDuration** property. |<ul><li>Group membership of only inactive users.</li><ul>|
|[principalResourceMembershipsScope](/graph/api/resources/principalResourceMembershipsScope)|Best applicable to review principals' access to resources where you configure unique pools of principals and resources.|<ul><li>Reviewing access of 3 specific principals across 1 Microsoft 365 group *and* 1 privileged Azure AD role.</li><ul>|

In this article, you will use these types of accessReviewScope to configure a wide range of Azure AD resources as the scope of your access review. This can help you to automate proactive review and keep control over access to resources in your organization.  

## Use accessReviewQueryScope to configure scope

To configure the scope by using the **accessReviewQueryScope** type, set the values of its **query**, **queryRoot**, and **queryType** properties. For descriptions of these properties, see [accessReviewQueryScope](/graph/api/resources/accessreviewqueryscope) resource type.

### Example 1: Review all users assigned to a group

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/groups/{group id}/transitiveMembers",
    "queryType": "MicrosoftGraph"
}
```

To review *only inactive users* assigned to the group:

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewInactiveUsersQueryScope",
    "inactiveDuration": "P30D",
    "query": "/groups/{group id}/transitiveMembers",
    "queryType": "MicrosoftGraph"
}
```

### Example 2: Review all guest users assigned to a group

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/groups/{group id}/transitiveMembers/microsoft.graph.user/?$filter=(userType eq 'Guest')",    
    "queryType": "MicrosoftGraph"
}
```

### Example 3: Review all users assigned to all Microsoft 365 groups

```http
"instanceEnumerationScope": {
    "query": "/groups?$filter=(groupTypes/any(c:c eq 'Unified'))",
    "queryType": "MicrosoftGraph"
},
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "./members/microsoft.graph.user",
    "queryType": "MicrosoftGraph"
}
```
Because this review is applied on all Microsoft 365 groups, configure the **instanceEnumerationScope** to specify the Microsoft 365 groups to review. Note that dynamic groups and role-assignable groups are not included in this review.

### Example 4: Review all guest users assigned to all Microsoft 365 groups

```http
"instanceEnumerationScope": {
    "query": "/groups?$filter=(groupTypes/any(c:c eq 'Unified'))",
    "queryType": "MicrosoftGraph"
},
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "./members/microsoft.graph.user/?$filter=(userType eq 'Guest')",
    "queryType": "MicrosoftGraph"
}
```

Because this review is applied on all Microsoft 365 groups, configure the **instanceEnumerationScope** to specify the Microsoft 365 groups to review. Note that dynamic groups and role-assignable groups are not included in this review.

### Example 5: Review all guest users assigned to all Teams

```http
"instanceEnumerationScope": {
    "query": "/groups?$filter=(groupTypes/any(c:c eq 'Unified') and resourceProvisioningOptions/Any(x:x eq 'Team')')",
    "queryType": "MicrosoftGraph"
},
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "./members/microsoft.graph.user/?$filter=(userType eq 'Guest')",
    "queryType": "MicrosoftGraph"
}
```
    
Because this review is applied on all Teams-enabled Microsoft 365 groups, configure the **instanceEnumerationScope** to specify the Teams-enabled Microsoft 365 groups to review.  Note that dynamic groups and role-assignable groups are not included in this review.

This review won't include B2B direct connect users in teams with shared channels. To include B2B direct connect users in teams with shared channels, see [Example 14: Review all users assigned to a team, including B2B direct connect users in a team with shared channels](#example-14-review-all-users-assigned-to-a-team-including-b2b-direct-connect-users-in-a-team-with-shared-channels).

### Example 6: Review all inactive guest users assigned to all Microsoft 365 groups

```http
"instanceEnumerationScope": {
    "query": "/groups?$filter=(groupTypes/any(c:c eq 'Unified'))",
    "queryType": "MicrosoftGraph"
},
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewInactiveUsersQueryScope",
    "query": "./members/microsoft.graph.user/?$filter=(userType eq 'Guest')",
    "queryType": "MicrosoftGraph",
    "inactiveDuration": "P30D"
}
```

Because this review is applied on inactive users, use the **accessReviewInactiveUsersQueryScope** resource and specify the **@odata.type** type property with the value `#microsoft.graph.accessReviewInactiveUsersQueryScope`. Note that dynamic groups and role-assignable groups are not included in this review.

### Example 7: Review all inactive guest users assigned to all Teams

```http
"instanceEnumerationScope": {
    "query": "/groups?$filter=(groupTypes/any(c:c eq 'Unified') and resourceProvisioningOptions/Any(x:x eq 'Team')')",
    "queryType": "MicrosoftGraph"
},
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewInactiveUsersQueryScope",
    "query": "./members/microsoft.graph.user/?$filter=(userType eq 'Guest')",
    "queryType": "MicrosoftGraph",
    "inactiveDuration": "P30D"
}
```

Because this review is applied on all teams, configure the **instanceEnumerationScope** property to specify all teams. Note that dynamic groups and role-assignable groups are not included in this review.

This review won't include B2B direct connect users in teams with shared channels. To include B2B direct connect users in teams with shared channels, see [Example 14: Review all users assigned to a team, including B2B direct connect users in a team with shared channels](#example-14-review-all-users-assigned-to-a-team-including-b2b-direct-connect-users-in-a-team-with-shared-channels).

### Example 8: Review all assignment to Entitlement Management access packages

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/identityGovernance/entitlementManagement/accessPackageAssignments?$filter=(accessPackageId eq '{package id}' and assignmentPolicyId eq '{id}')",
    "queryType": "MicrosoftGraph"
}
```

### Example 9: Review all service principals assigned to a privileged role

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/roleManagement/directory/roleAssignmentScheduleInstances?$expand=principal&$filter=(isof(principal,'microsoft.graph.servicePrincipal') and roleDefinitionId eq '{role ID}')",
    "queryType": "MicrosoftGraph"
}
```
    
### Example 10: Review all users assigned to a privileged role (all active and eligible assignments included)

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/roleManagement/directory/roleDefinitions/{role ID}",
    "queryType": "MicrosoftGraph"
}
```
    
### Example 11: Review all users with eligible assignment to a privileged role

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/roleManagement/directory/roleEligibilityScheduleInstances?$expand=principal&$filter=(isof(principal,'microsoft.graph.user') and roleDefinitionId eq '{role ID}')",
    "queryType": "MicrosoftGraph"
}
```
    
### Example 12: Review all users with active assignment to a privileged role

```http
"scope": {
    "@odata.type": "#microsoft.graph.accessReviewQueryScope",
    "query": "/roleManagement/directory/roleAssignmentScheduleInstances?$expand=principal&$filter=(assignmentType eq 'Assigned' and isof(principal,'microsoft.graph.user') and roleDefinitionId eq '{role ID}')",
    "queryType": "MicrosoftGraph"
}
```

## Use principalResourceMembershipsScope to configure scope

The **principalResourceMembershipsScope** exposes the **principalScopes** and **resourceScopes** properties to support more tailored configuration options for the scope of the **accessReviewScheduleDefinition**. This includes reviewing access for multiple principals or groups of principals to multiple resources.

### Example 13: Review all inactive guest users assigned to all groups

```http
"scope": {
    "@odata.type": "#microsoft.graph.principalResourceMembershipsScope",
    "principalScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewInactiveUsersQueryScope",
            "query": "/users?$filter=(userType eq 'Guest')",
            "queryType": "MicrosoftGraph",
            "inactiveDuration": "P30D"
        }
    ],
    "resourceScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/groups",
            "queryType": "MicrosoftGraph"
        }
    ]
}
```

In this example, the principals are all inactive guest users with the period of their inactivity calculated as 30 days from the start date of the access review instance.

### Example 14: Review all users assigned to a team, including B2B direct connect users in a team with shared channels

```http
"scope": {
    "@odata.type": "#microsoft.graph.principalResourceMembershipsScope",
    "principalScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/users",
            "queryType": "MicrosoftGraph",
            "queryRoot": null
        }
    ],
    "resourceScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/groups/{groupId}/transitiveMembers",
            "queryType": "MicrosoftGraph",
            "queryRoot": null
        },
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/teams/{groupId}/channels?$filter=(membershipType eq 'shared')",
            "queryType": "MicrosoftGraph",
            "queryRoot": null
        }
    ]
}
```

In this example, the access review is scoped to all users who are members of a team or assigned to a shared channel within the team, including internal users, B2B collaboration users, and B2B direct connect users.

To review B2B direct connect users and teams within shared channels, you must specify the `/teams/{groupId}/channels?$filter=(membershipType eq 'shared')` **query** pattern in the **resourceScopes** object. An *all teams* review, such as [Example 7](#example-5-review-all-guest-users-assigned-to-all-teams), won't include B2B direct connect users and teams within shared channels.

> [!NOTE]
> Access review of B2B direct connect users and teams is only supported in single-stage access reviews and not in multi-stage access reviews.

### Example 15: Review all guest users assigned to a directory role

```http
"scope": {
    "@odata.type": "#microsoft.graph.principalResourceMembershipsScope",
    "principalScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/users?$filter=(userType eq 'Guest')",
            "queryType": "MicrosoftGraph"
        }
    ],
    "resourceScopes": [
        {
            "@odata.type": "#microsoft.graph.accessReviewQueryScope",
            "query": "/roleManagement/directory/roleDefinitions/{role id}",
            "queryType": "MicrosoftGraph"
        }
    ]
}
```

## Next steps

+ [Assign reviewers to your access review definition](/graph/accessreviews-reviewers-concept)
+ [Try out tutorials](/graph/accessreviews-overview) to learn how to use the access reviews API to review access to Azure AD resources
+ [Create an access review](/azure/active-directory/governance/create-access-review)
