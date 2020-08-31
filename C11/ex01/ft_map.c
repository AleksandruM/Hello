/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_map.c                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/26 16:24:37 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/26 18:59:43 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>

int		*ft_map(int *tab, int length, int (*f)(int))
{
	int i;
	int *tab_retv;

	i = 0;
	tab_retv = (int*)malloc(sizeof(*tab) * length);
	while (i < lenght)
	{
		tab_retv[i] = f(tab[i]);
		i++;
	}
	return (tab_retv);
}
